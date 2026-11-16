package Basics;

import java.util.ArrayDeque;

class ArrayDequeDemo {
	public static void main(String[] args) {
		// Create a tree set
		ArrayDeque<String> adq = new ArrayDeque<>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");

		System.out.println("Popping the stack");
		while (adq.peek() != null) {
			System.out.println(adq.pop() + " ");
		}
		System.out.println();
	}
}
