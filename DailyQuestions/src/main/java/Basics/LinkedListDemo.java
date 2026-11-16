package Basics;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();

		// Add eleemnts to the linked list
		l1.add("F");
		l1.add("B");
		l1.add("D");
		l1.add("E");
		l1.add("C");
		l1.addLast("Z");
		l1.addLast("A");
		l1.addFirst("A");
		l1.add(1, "A2");

		System.out.println("Original contents of t1: " + l1);
		// Remove elements from the linked list
		l1.remove("F");
		l1.remove(2);

		System.out.println("Contents of t1 after deletion: " + l1);

		l1.removeFirst();
		l1.removeLast();

		System.out.println("l1 after deleting first and last: " + l1);
		// Get and set value
		String val = l1.get(2);
		l1.set(2, val + " Changed.");

		System.out.println("l1 after change: " + l1);
	}
}
