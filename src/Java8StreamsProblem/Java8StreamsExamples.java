import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamsExamples {
	public static void main(String[] args) {
		System.out.println("Hi the stream bible!!!!!");

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", "HR", 55000, 28),
				new Employee(2, "Bob", "IT", 70000, 32),
				new Employee(3, "Charlie", "Finance", 80000, 45),
				new Employee(4, "David", "IT", 65000, 26),
				new Employee(5, "Eve", "HR", 73000, 41),
				new Employee(5, "Ansu", "HR", 73000, 41),
				new Employee(2, "Yasva", "HR", 73000, 41)
		);
		Map<String, Double> deptToAvgSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		List<Employee> topEarnersInIT = employees.stream()
				.filter(e -> e.getDepartment().equals("IT"))
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(2)
				.toList();
		Map<String, Double> deptToMedianSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
						Collectors.toList(),
						list -> {
							List<Double> salaries = list.stream()
									.map(Employee::getSalary)
									.sorted()
									.collect(Collectors.toList());
							int size = salaries.size();
							if (size % 2 == 0) {
								return (salaries.get(size / 2 - 1) + salaries.get(size / 2)) / 2.0;
							} else {
								return salaries.get(size / 2);
							}
						}
				)));
		//1. Filtering Employees Based on Conditions
		List<Employee> listByAge = employees.stream().filter(e -> e.getAge() > 35).toList();
		System.out.println("Age Above: " + listByAge);

		//2. Sorting Employees by salary
		List<Employee> sortEmpBySalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
		System.out.println("Salary sort: " + sortEmpBySalary);

		//Sort Employees by salary - nulls first
		List<Employee> sortEmpBySalaryNullsFirst = employees.stream()
				.sorted(Comparator.nullsFirst(Comparator.comparing(Employee::getSalary)))
				.toList();
		System.out.println("Salary sort: " + sortEmpBySalaryNullsFirst);

		//Sort Employees by name
		List<Employee> sortEmpByName = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		System.out.println("Salary sort: " + sortEmpByName);

		//

		//3. Reverse Sorting Employees by salary
		List<Employee> reverseSortEmpBySalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
		System.out.println("Salary sort: " + reverseSortEmpBySalary);

		//4. Mapping Employee Names
		List<String> mappingEmpNames = employees.stream().map(e -> e.getName()).toList();
		System.out.println("Employee Names: " + mappingEmpNames);

		//5. Calculating Sum, Average, Min, and Max
		double totalSalary = employees.stream().mapToDouble(e-> e.getSalary()).sum();
		System.out.println(totalSalary);

		OptionalDouble avgSalary = employees.stream().mapToDouble(e-> e.getSalary()).average();
		System.out.println("Avg sal " + avgSalary);

		Optional<Employee> maxSal = employees.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Max sal " + maxSal.get().getSalary());

		//Distinct
		List<String> distinctEmpNames = employees.stream().map(e -> e.getName()).distinct().toList();

		// Top 2 with highest salary
		List<Employee> topTwoEmployees = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(2).toList();

		//Grouping Employees by Department
		Map<String,List<Employee>> empDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Grouped employee " + empDept);

		//Grouping Employees by Department and summing the salary.
		Map<String, Double> depToBudget = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		System.out.println("HR Budget: " + depToBudget.get("HR"));
		System.out.println("IT Budget: " + depToBudget.get("IT"));
		System.out.println("Finance Budget: " + depToBudget.get("Finance"));

		//Partitioned Employees by salary threshold
		Map<Boolean,List<Employee>> empPartition = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 60000));
		System.out.println("empPartition employee " + empPartition);

		//Counting Employees in Each Department
		Map<String,Long> empCountByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("empCountByDept employee " + empCountByDept);

		//Sum of all the employees
		double sumOfAllTheSalary = employees.stream().map(e -> e.getSalary()).reduce(0.0,(a,b) -> a+b);
		//                                            mapToDouble(e -> e.getSalary()).sum();
		System.out.println("sumOfAllTheSalary employee " + sumOfAllTheSalary);

		//Creating custom collectors
		String concatenatedNames = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
		System.out.println("concatenatedNames employee " + concatenatedNames);

		//Find oldest and youngest employee
		Optional<Employee> empAge = employees.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("empAge employee " + empAge.get().getAge() +" ---- " +  empAge.get().getName());
		System.out.println("empAge.isPresent() " + empAge.isPresent());
		//System.out.println("empAge.ifPresent() " + empAge.ifPresent(e -> e.getAge()>50));

		// Using isPresent
		if (empAge.isPresent()) {
			System.out.println("Ag555: " + empAge.get());
		}

		// Using ifPresent
		empAge.ifPresent(age -> System.out.println("Age333: " + age));

		//Find oldest and youngest employee
		Optional<Employee> empAgeYoungest = employees.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println("empAgeYoungest employee " + empAgeYoungest.get().getAge() +" ---- " +  empAgeYoungest.get().getName());

		//Print duplicate objects
		List<Employee> duplicateEmployees = employees.stream()
				.collect(Collectors.groupingBy(Employee::getId))
				.entrySet().stream()
				.filter(entry -> entry.getValue().size() > 1)
				.flatMap(entry -> entry.getValue().stream())
				.toList();

		System.out.println("Duplicate objects:\n");
		duplicateEmployees.forEach(System.out::println);

		//Print duplicate ids.
		List<Integer> duplicateIds = employees.stream()
				.collect(Collectors.groupingBy(Employee::getId, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.toList();
		System.out.println("Duplicate ids:"+duplicateIds);

		//Print department with the highest budget
		String highestSalaryDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);
		System.out.println("Highest budget dept:"+highestSalaryDept);

		Map<String, Set<String>> deptToNames = employees.stream().collect(
				Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.mapping(
								Employee::getName,
								Collectors.toSet())));
		System.out.println("deptToNames: " + deptToNames);

		Map<String, Optional<Employee>> depybyMaxSalary =
				employees.stream().collect(
						Collectors.groupingBy(Employee::getDepartment,
								Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));



		//First non-repeating character in a string
		String input = "swiss";
		Character result = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						c -> c,//Function.identity()
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse(null);
		System.out.println("First non repeating char:"+result);

		/**\
		 * Mapping to another object
		 *
		 * List<Employee> employees = persons.stream()
		 *                 .map(person -> new Employee.Builder()
		 *                         .name(person.getName())
		 *                         .age(person.getAge())
		 *                         .location(person.getCity())
		 *                         .build()
		 *                 )
		 *                 .collect(Collectors.toList());
		 */

	}
}
