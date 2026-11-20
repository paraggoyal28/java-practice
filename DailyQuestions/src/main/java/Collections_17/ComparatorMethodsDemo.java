package Collections_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMethodsDemo {
	record Task(String title, String category, int priority, double estimatedHour) {}

	public static void main(String[] args){
		List<Task> tasks = Arrays.asList(
				new Task("Fix login bug", "Backend", 1, 2.5),
				new Task("Write API docs", "Backend", 1, 4.0),
				new Task("Update color palette", "UI", 2, 1.5),
				new Task("Audit SQL queries", "Backend", 1, 2.5),
				new Task("Design settings screen", "UI", 2, 3.0)
		);

		Comparator<Task> taskComparator = Comparator
				// 1. comparingInt: avoid boxing overhead for primitive int priority (1 = highest)
				.comparingInt(Task::priority)
				// 2. thenComparing(keyExtractor, comparator) -> custom order for category (UI before backend)
				.thenComparing(Task::category, Comparator.reverseOrder())
				// 3. thenComparing(keyExtractor, comparator) -> tie breaker by estimatedHours descending
				.thenComparing(Task::estimatedHour, Comparator.reverseOrder())
				// 4. thenComparing: final tie breaker by title alphabetically
				.thenComparing(Task::title);

		tasks.sort(taskComparator);
		tasks.forEach(System.out::println);

		// Standalone example of Comparator.comparing(keyExtractor, keyComparator)
		// Sort by category case-insensitively without mutating the string
		Comparator<Task> byCategoryIgnoreCase =
				Comparator.comparing(Task::category, String.CASE_INSENSITIVE_ORDER);

		tasks.stream()
				.sorted(byCategoryIgnoreCase)
				.forEach(System.out::println);
	}
}

