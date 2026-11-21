package Collections_17;

import java.util.Arrays;

public class ArraysEqualsVsDeepEqualsExample {
	public static void main(String[] args){
		// 1D array: Arrays.equals and deepEquals agree
		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3};
		System.out.println("1D Array equals: " + Arrays.equals(a1, a2));
		System.out.println("1D Arrays.deepEquals: " + Arrays.deepEquals(new Object[]{a1}, new Object[]{a2}));

		// 2D arrays: equals and deepEquals differ
		int[][] grid1 = {
				{1, 2},
				{3, 4}
		};
		int[][] grid2 = {
				{1, 2},
				{3, 4}
		};

		//Arrays.equals compares inner int[] arrays via Object equals (reference equality ==)
		System.out.println("2D array equals: " + Arrays.equals(grid1, grid2));
		System.out.println("2D Arrays.deepEquals: " + Arrays.deepEquals(grid1, grid2));

		Object[] box1 = {Arrays.asList("x", "y")};
		Object[] box2 = {Arrays.asList("x", "y")                                   };

		System.out.println("Nested Arrays.equals : " + Arrays.equals(box1, box2));     // false (int[] != int[])
		System.out.println("Nested deepEquals    : " + Arrays.deepEquals(box1, box2)); // true
	}
}
