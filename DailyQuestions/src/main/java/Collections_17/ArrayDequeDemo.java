package Collections_17;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args){
		ArrayDeque<String> adq = new ArrayDeque<>();

		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("C");
		adq.push("M");
		System.out.println(adq);
		System.out.println("Popping the elements: ");

		while (adq.peek() != null) {
			System.out.println(adq.pop() + " ");
		}
		System.out.println();
	}
}
