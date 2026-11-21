package Collections_17;

import java.util.Arrays;

public class ArraysParallelPrefixExample {
	public static void main(String[] args){
		// 1. Running sum (prefix sum on an int[])
		int[] deltas = {10, -3, 5, 8, -2};
		Arrays.parallelPrefix(deltas, Integer::sum);
		System.out.println("Running balance : " + Arrays.toString(deltas));

		// 2. Range prefix on [fromIndex, toIndex): indices 1..3 (1 is inclusive, 4 is exclusive)
		int[] values = {100, 2, 3, 4, 200};
		Arrays.parallelPrefix(values, 1, 4, (left, right) -> left * right);
		System.out.println("Range[1, 4) product: " + Arrays.toString(values));

		// 3. Object array prefix (e.g building a cumulative path or log chain)
		String[] segments = {"/api", "/v1", "/users", "/profile"};
		Arrays.parallelPrefix(segments, (left, right) -> left + right);
		System.out.println("Cumulative paths: " + Arrays.toString(segments));
	}
}
