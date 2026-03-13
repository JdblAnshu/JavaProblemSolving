import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingQ1 {

	public static void main(String[] args) {
		String str = "swiss";
		System.out.println(
		str.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue()==1).findFirst().map(Map.Entry::getKey).orElse(null));

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", "HR", 55000, 28),
				new Employee(2, "Bob", "IT", 70000, 32),
				new Employee(3, "Charlie", "Finance", 80000, 45),
				new Employee(4, "David", "IT", 65000, 26),
				new Employee(5, "Eve", "HR", 73000, 41),
				new Employee(5, "Ansu", "HR", 73000, 41),
				new Employee(2, "Yasva", "HR", 73000, 41)
		);


		//Filter employee whose age is above 35.

		System.out.println(employees.stream().filter(e -> e.getAge()>35).toList());


		//Sorting employees by salary.

		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList());

		//Sort employees by salary with nulls first.

		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList());

		System.out.println("Min max avg");

		System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary());

		employees.stream().mapToDouble(Employee::getSalary).sum();

		employees.stream().map(Employee::getName).distinct().toList();

		System.out.println("Top 2 highest salary");



		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).limit(1).toList());



		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary))).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(e -> e.getKey()).orElse(null);

		str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).map(e -> e.getKey()).orElse(null);


		List<Integer> list1 = List.of(1, 2, 3, 2, 4, 3, 5);

		System.out.println(list1.stream().distinct().toList());















	}
}
