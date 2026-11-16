package Basics;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String args[]) {
		ArrayList<Integer> s1 = new ArrayList<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);

		System.out.println("Contents of s1: " + s1);

		// Get the array
		Integer ia[] = new Integer[s1.size()];
		ia = s1.toArray(ia);

		int sum = 0;
		// Sum the array
		for (int i: ia) sum += i;
		System.out.println("Sum is: " + sum);
	}
}
