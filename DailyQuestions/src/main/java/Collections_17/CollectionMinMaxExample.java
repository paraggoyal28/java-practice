package Collections_17;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMinMaxExample {
	record Task(String title, Integer priority) {}

	public static void main(String[] args){
		// 1. Natural ordering (comparable)
		List<Integer> numbers = List.of(12, 7, 34, 54, 12, 4, 53);
		System.out.println("Min element: " + Collections.min(numbers));
		System.out.println("Max element: " + Collections.max(numbers));

		// 2. Custom Comparator
		List<Task> tasks = List.of(
				new Task("Write Tests", 2),
				new Task("Fix Outage", 1),
				new Task("Update Readme", 4),
				new Task("Work on bug", null)
		);

		Task highestPriorityTask = Collections.min(tasks, Comparator.comparingInt(Task::priority));
		Task lowestPriorityTask = Collections.max(tasks, Comparator.comparingInt(Task::priority));

		System.out.println("Highest Priority (smallest int): " + highestPriorityTask);
		System.out.println("Lowest Priority (greatest int): " + lowestPriorityTask);


	}
}
