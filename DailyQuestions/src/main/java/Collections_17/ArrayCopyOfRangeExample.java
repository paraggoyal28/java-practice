package Collections_17;

import java.util.Arrays;

public class ArrayCopyOfRangeExample {
	public static void main(String[] args){
		String[] letters = {"A", "B", "C", "D", "E"};

		String[] slice = Arrays.copyOfRange(letters, 1, 4);
		System.out.println("Slice[1, 4): " + Arrays.toString(slice));

		slice[0] = "Z";
		System.out.println("Original: " + Arrays.toString(letters));

		// 2. Empty range from
		String[] empty = Arrays.copyOfRange(letters, 2, 2);
		System.out.println("Empty[2, 2) " + Arrays.toString(empty));

		int[] score = {10, 20, 30};
		int[] padded = Arrays.copyOfRange(score, 1, 6);
		System.out.println("Padded [1, 6): " + Arrays.toString(padded));
	}
}
