import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamExamplesPractice2 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice", "HR", 55000, 28),
				new Employee(2, "Bob", "IT", 70000, 32),
				new Employee(3, "Charlie", "Finance", 80000, 45),
				new Employee(4, "David", "IT", 65000, 26),
				new Employee(5, "Eve", "HR", 73000, 41)
		);


		//1. Filtering Employees Based on Conditions

		List<Employee> empList = employees.stream().filter(x -> x.getSalary() > 65000).toList();
		System.out.println(empList);


		//2. Sorting Employees by salary

		List<Employee> sortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		System.out.println(sortedEmp);

		//3. Reverse Sorting Employees by salary
		List<Employee> reverseSortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
		System.out.println(reverseSortedEmp);

		//4. Mapping Employee Names
		List<String> empNames = employees.stream().map(Employee::getName).toList();
		System.out.println(empNames);

		//5. Calculating Sum, Average, Min, and Max
		System.out.println(employees.stream().max(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println(employees.stream().min(Comparator.comparing(Employee::getSalary)));

		System.out.println(employees.stream().mapToDouble(Employee::getSalary).sum());

		//Grouping Employees by Department
		System.out.println("----------------------- Grouping by------------------");
		Map<String,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		for(Map.Entry<String, List<Employee>> entry : map.entrySet()){

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		map.forEach((key, value) -> System.out.println(value + " -----> " +  key));



		//Partitioned Employees by Department ---> Same as grouping by

		//Counting Employees in Each Department
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));



		//Sum of all the employees
		//Creating custom collectors
		//Find oldest and youngest employee
		// Using isPresent
		// Using ifPresent
		//Find oldest and youngest employee


	}



}
