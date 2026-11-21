package Collections_17;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortExample {
	record Employee(String name, int salary) {}
	public static void main(String[] args) {
		// 1. Primitive array: ascending natural order (Dual-Pivot Quicksort)
		int[] numbers = {42, 7, 19, 3, 28};
		Arrays.sort(numbers);
		System.out.println("Sorted into: " + Arrays.toString(numbers));
    	// [3, 7, 19, 28, 42]

		// 2. Range Sort on [fromIndex, toIndex): Sorts indices 1, 2, 3: leaves 0 and 4 untouched
		int[] partial = {90, 50, 20, 80, 10};
		Arrays.sort(partial, 1, 4);
		System.out.println("Range[1, 4] sort: " + Arrays.toString(partial));

		// 3. Object array with custom Comparator (TimSort)
		Employee[] team = {
				new Employee("Alice", 120_000),
				new Employee("Bob", 95_000),
				new Employee("Charlie", 120_000)
		};

		// Sort by salary descending, then name ascending
		Arrays.sort(team, Comparator.comparingInt(Employee::salary).reversed()
				.thenComparing(Employee::name));

		System.out.println("Sorted team: " + Arrays.toString(team));


	}
}
