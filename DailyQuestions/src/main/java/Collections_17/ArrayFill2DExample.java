package Collections_17;

import java.util.Arrays;

public class ArrayFill2DExample {
	public static void main(String[] args){
		int[][] matrix = new int[3][4];
		for (int[] row: matrix) {
			Arrays.fill(row, -1);
		}

		System.out.println("Full 2D fill: \n"+ Arrays.deepToString(matrix));

		// 2. Fill only a slice of each row [fromIndex, toIndex) -> columns 1 and 2
		for (int[] row: matrix) {
			Arrays.fill(row, 1, 3, 9);
		}
		System.out.println("Column range [1, 3) fill: \n" + Arrays.deepToString(matrix));

		// 3. Worked on jagged 2D arrays too (rows of different length)
		int[][] jagged = new int[][]{
				new int[2],
				new int[4],
				new int[1]
		};
		for (int[] row: jagged) {
			Arrays.fill(row, 7);
		}

		System.out.println("Jagged 2D fill: \n" + Arrays.deepToString(jagged));
	}
}
