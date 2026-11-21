package Collections_17;

import java.util.Arrays;

public class ArraySetAllExample {
	public static void main(String[] args) {
		// 1. Sequential setAll on a primitive int[] (IntToIntFunction: index -> value)
		int[] squares = new int[5];
		Arrays.setAll(squares, i -> i * i);
		System.out.println("setAll squares: " + Arrays.toString(squares));

		// 2. setAll on a String[] (IntFunction<String>: index -> value)
		String[] seatLabels = new String[4];
		Arrays.setAll(seatLabels, i -> "SEAT-" + (i + 1));
		System.out.println("setAll seatLabels: " + Arrays.toString(seatLabels));

		// 3. parallelSetAll on a larger double[] using ForkJoinPool.commonPool()
		double[] weights = new double[50_000];
		Arrays.parallelSetAll(weights, i -> Math.sin(i * 0.01));
		System.out.println("parallelSetAll first 3: " + Arrays.toString(Arrays.copyOf(weights, 3)));
	}
}
