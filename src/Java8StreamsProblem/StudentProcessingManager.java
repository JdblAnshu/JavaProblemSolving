
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

class Student {
    String name;
    double grade;
    String subject;

    public Student(String name, double grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }
}

class StudentGradeProcessingManager {

    // Calculate subject average grade
    public Collector<Student, ?, Map<String, Double>> getSubjectAverageGrade() {
        return Collectors.groupingBy(
                student -> student.subject,
                Collectors.averagingDouble(student -> student.grade)
        );
    }

    // Filter students by subject and grade threshold
    public Predicate<Student> filterBySubjectGrade(String subject, double grade) {
        return student -> student.subject.equals(subject) && student.grade >= grade;
    }

    // Get the top N students by grade in a given subject
    public Stream<Student> getTopStudents(Stream<Student> studentStream, String subject, int top) {
        return studentStream
                .filter(student -> student.subject.equals(subject))
                .sorted((s1, s2) -> Double.compare(s2.grade, s1.grade))
                .limit(top);
    }

    // Calculate the median grade for a subject
    public Collector<Student, ?, Map<String, Double>> getMedianForSubject() {
        return Collectors.groupingBy(
                student -> student.subject,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            List<Double> grades = list.stream()
                                    .map(student -> student.grade)
                                    .sorted()
                                    .collect(Collectors.toList());
                            int size = grades.size();
                            if (size % 2 == 0) {
                                return (grades.get(size / 2 - 1) + grades.get(size / 2)) / 2.0;
                            } else {
                                return grades.get(size / 2);
                            }
                        }
                )
        );
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String subject = bufferedReader.readLine().trim();
        int top = Integer.parseInt(bufferedReader.readLine().trim());
        int studentsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++) {
            String studentItem = bufferedReader.readLine();
            String[] studentDetails = studentItem.split(",");
            String name = studentDetails[0];
            double grade = Double.parseDouble(studentDetails[1]);
            String studentSubject = studentDetails[2];
            students.add(new Student(name, grade, studentSubject));
        }

        StudentGradeProcessingManager studentGradeProcessingManager = new StudentGradeProcessingManager();

        // Get subject average grades
        Map<String, Double> subjectAverageGrades = students.stream()
                .collect(studentGradeProcessingManager.getSubjectAverageGrade());

        // Get students with grades above average for the given subject
        List<Student> studentsWithSubjectGradeAboveAverage = students.stream()
                .filter(studentGradeProcessingManager.filterBySubjectGrade(subject, subjectAverageGrades.get(subject)))
                .collect(Collectors.toList());

        // Get top N students in the subject
        List<Student> topStudents = studentGradeProcessingManager.getTopStudents(students.stream(), subject, top)
                .collect(Collectors.toList());

        // Get median grade for the subject
        Map<String, Double> medianForSubject = students.stream()
                .collect(studentGradeProcessingManager.getMedianForSubject());

        // Output the results
        bufferedWriter.write("Subject Average Grades:\n");
        subjectAverageGrades.forEach((sub, avg) -> {
            try {
                bufferedWriter.write(sub + ": " + avg + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedWriter.write("\nStudents with Grades Above Average:\n");
        studentsWithSubjectGradeAboveAverage.forEach(student -> {
            try {
                bufferedWriter.write("[Student{name='" + student.name + "'}]\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedWriter.write("\nTop Students:\n");
        topStudents.forEach(student -> {
            try {
                bufferedWriter.write("[Student{name='" + student.name + "'}]\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedWriter.write("\nMedian Grades for Subject:\n");
        medianForSubject.forEach((sub, median) -> {
            try {
                bufferedWriter.write(sub + ": " + median + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
