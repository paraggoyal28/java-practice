package Collections_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	record Employee(String name, String department, Double salary) {}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", "Engineering", 120_000.0),
				new Employee("Bob", "Engineering", 120_000.0),
				new Employee("Charlie", "Engineering", 90_000.0),
				new Employee("Diana", "Design", null),
				new Employee("Eve", "Design", 110_000.0),
				null
		);

		Comparator<Employee> bySalaryDescThenName = Comparator
				.nullsFirst(
						Comparator
								.comparing(
										Employee::salary,
										Comparator.nullsLast(Comparator.naturalOrder())
								).reversed()
								.thenComparing(Employee::department)
								.thenComparing(Comparator.comparing(Employee::name).reversed())
				);
		employees.sort(bySalaryDescThenName);
		employees.forEach(System.out::println);
	}
}
