package Collections_17;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
	public static void main(String[] args) {
		// Create and initialize linked list
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(89);
		ll.add(23);
		ll.add(34);
		ll.add(76);
		// Create a reverse order comparator
		Comparator<Integer> r = Collections.reverseOrder();

		// sort list by using the comparator
		Collections.sort(ll, r);

		System.out.println("List sorted in reverse: ");
		for (int i: ll) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Shuffle list
		Collections.shuffle(ll);

		// Display randomized list
		System.out.println("List shuffled: ");
		for (int i: ll) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Maximum: " + Collections.max(ll));
		System.out.println("Minimum: " + Collections.min(ll));
	}
}
