package Collections_17;

import java.util.Arrays;

public class ArraysCopyOfExample {
	public static void main(String[] args) {
		String[] original = {"Java", "Kotlin", "Scala"};

		// 1. Exact copy (new array instance, same contents)
		String[] exactCopy = Arrays.copyOf(original, original.length);
		exactCopy[0] = "Groovy";
		System.out.println("Original: " + Arrays.toString(original));
		System.out.println("Exact Copy: " + Arrays.toString(exactCopy));

		// 2. Grow/Resize array (extra slots padded with null for objects, 0 for primitives)
		String[] grown = Arrays.copyOf(original, 5);
		System.out.println("Grown : " + Arrays.toString(grown));

		// Shrink/truncate array
		int[] scores = {10, 20, 30, 40};
		int[] topTwo = Arrays.copyOf(scores, 2);
		System.out.println("Top two elements: " + Arrays.toString(topTwo));


	}
}
