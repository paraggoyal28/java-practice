package Collections_17;

import java.util.Arrays;

public class ArraysFillExample {
	public static void main(String[] args){
		// 1. Fill an entire primitive array
		int[] scores = new int[5];
		Arrays.fill(scores, -1);
		System.out.println("Full int fill: " + Arrays.toString(scores));

		Arrays.fill(scores, 1, 4, 100);
		System.out.println("Range[1, 4) fill: " + Arrays.toString(scores));

		String[] labels = new String[3];
		Arrays.fill(labels, "PENDING");
		System.out.println("Object array fill: " + Arrays.toString(labels));
	}
}
