package Collections_17;

import java.util.Arrays;
import java.util.Spliterator;

public class ArraysSpliteratorExample {
	public static void main(String[] args){
		String[] items = {"A", "B", "C", "D", "E", "F"};

		// 1. Create a SplitIterator over the full array (or range: Arrays.splitIterator(items, 1, 5))
		Spliterator<String> sp1 = Arrays.spliterator(items);
		System.out.println("Initial estimate: " + sp1.estimateSize());
		System.out.println("Has SIZED flag: " + sp1.hasCharacteristics(Spliterator.SIZED));

		// 2. Consume a single element with tryAdvance (returns false when empty)
		System.out.print("First element....");
		sp1.tryAdvance(System.out::println); // A (remaining estimatedSize - 5)

		Spliterator<String> sp2 = sp1.trySplit();

		System.out.print("sp2 (split chunk)...");
		if (sp2 != null) {
			sp2.forEachRemaining(val -> System.out.print(val + " "));
		}
		System.out.println();

		System.out.print("sp1 (Remaining) ....");
		sp1.forEachRemaining(val -> System.out.print(val + " "));
		System.out.println();
	}
}
