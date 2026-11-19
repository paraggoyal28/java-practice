package Collections_17;

import java.util.ArrayList;

public class ForEachDemo {
	public static void main(String[] args){
		ArrayList<Integer> vals = new ArrayList<>();

		// Add values to vals
		vals.add(1);
		vals.add(2);
		vals.add(4);
		vals.add(7);
		vals.add(8);

		// Use for loop to display the values
		System.out.println("Contents of val:");
		for (int v: vals) {
			System.out.print(v + " ");
		}
		System.out.println();

		// Now sum the values by using a for loop
		int sum = 0;
		for (int v : vals) {
			sum += v;
		}
		System.out.println("Sum of values: " + sum);
	}
}
