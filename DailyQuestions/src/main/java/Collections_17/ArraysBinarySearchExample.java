package Collections_17;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearchExample {
	public static void main(String[] args){
		int[] nums = {40, 10, 30, 20, 50};
		Arrays.sort(nums);

		int foundIdx = Arrays.binarySearch(nums, 30);
		System.out.println("Index of 30: " + foundIdx);

		int missingIdx = Arrays.binarySearch(nums, 25);
		System.out.println("Missing 25: " + missingIdx);
		System.out.println("Insertion pt: " + (-missingIdx - 1));

		String[] words = {"banana", "apple", "cherry", "date"};
		Arrays.sort(words, Comparator.comparingInt(String::length));

		int wordIdx = Arrays.binarySearch(words, "mangoguava", Comparator.comparingInt(String::length));
		System.out.println("Matched length-5 slot: " + wordIdx);

	}
}
