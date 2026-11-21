package Collections_17;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysParallelSortExample {
  record Task(String id, int priority) {}
  public static void main(String[] args){
    // 1. Large primitive array (parallelism kicks in above a minimum threshold)
    int[] largeData = new int[100_000];
    for (int i = 0; i < largeData.length; ++i) {
      largeData[i] = (largeData.length - i) * 7 % 50_000;
    }

    Arrays.parallelSort(largeData);
    System.out.println("First 5 sorted ints: " + Arrays.toString(Arrays.copyOf(largeData, 5)));

    // 2. Range parallelSort on [fromIndex, toIndex): sorts indexes 1..3 leaves 0 and 4 untouched
    String[] labels = {"KEEP_FIRST", "Zebra", "Apple", "Mango", "KEEP_LAST"};
    Arrays.parallelSort(labels, 1, 4);
    System.out.println("Range[1, 4) result : " + Arrays.toString(labels));

    // 3. Object array with Comparator
    Task[] tasks = {
      new Task("T-1", 3),
      new Task("T-2", 1),
      new Task("T-3", 2)
    };
    Arrays.parallelSort(tasks, Comparator.comparingInt(Task::priority));
	System.out.println("Tasks by priority: " + Arrays.toString(tasks));
  }
}
