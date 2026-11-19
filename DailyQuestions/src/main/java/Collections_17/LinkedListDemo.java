package Collections_17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("E");
		ll.add("B");
		ll.add("F");
		ll.add("C");
		ll.add("F");
		ll.add("D");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		HashSet<String> mySet = new HashSet<>(ll);
		System.out.println(mySet);
		LinkedHashSet<String> myLinkedSet = new LinkedHashSet<>(ll);
		System.out.println(myLinkedSet);
		// Remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: " + ll);

		// Remove first and last elements
		ll.removeFirst();
		ll.removeLast();

		System.out.println("ll after deleting first and last: " + ll);

		// Get and set a value
		String val = ll.get(2);
		ll.set(2, val + " changed");
		System.out.println("ll after change: " + ll);
	}
}
