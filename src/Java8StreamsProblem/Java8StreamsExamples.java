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
				new Employee(5, "Eve", "HR", 73000, 41)
		);

		//1. Filtering Employees Based on Conditions
		List<Employee> listByAge = employees.stream().filter(e -> e.getAge() > 35).toList();
		System.out.println("Age Above: " + listByAge);

		//2. Sorting Employees by salary
		List<Employee> sortEmpBySalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
		System.out.println("Salary sort: " + sortEmpBySalary);

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

		//Grouping Employees by Department
		Map<String,List<Employee>> empDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Grouped employee " + empDept);

		//Partitioned Employees by Department
		Map<Boolean,List<Employee>> empPartition = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 60000));
		System.out.println("empPartition employee " + empPartition);

		//Counting Employees in Each Department
		Map<String,Long> empCountByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("empCountByDept employee " + empCountByDept);

		//Sum of all the employees
		double sumOfAllTheSalary = employees.stream().map(e -> e.getSalary()).reduce(0.0,(a,b) -> a+b);
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

	}
}
