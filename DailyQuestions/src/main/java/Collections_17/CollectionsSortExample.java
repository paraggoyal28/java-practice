package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortExample {
  record Employee(String name, int salary) {}

  public static void main(String[] args){
    // 1. Natural ordering
    List<String> languages = new ArrayList<>(List.of("Rust", "Java", "Go", "Kotlin"));
    Collections.sort(languages);
    System.out.println("Sorted languages: " + languages);

    // Reverse natural order
    Collections.sort(languages, Comparator.reverseOrder());
    System.out.println("Sorted descending: " + languages);

    // 2. Custom Comparator
    List<Employee> team =
        new ArrayList<>(
            List.of(new Employee("Alice", 120_000),
					new Employee("Bob", 95_000),
					new Employee("Charlie", 120_000)));

	Collections.sort(team,
			Comparator.comparingInt(Employee::salary)
					.reversed()
					.thenComparing(Employee::name));
	System.out.println("Sorted team: " + team);

	Collections.sort(team, Comparator.comparingInt(Employee::salary));
	System.out.println("Sorted team: " + team);
  }
}
