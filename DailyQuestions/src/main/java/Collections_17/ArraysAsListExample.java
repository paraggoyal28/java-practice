package Collections_17;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args){
		String[] colors = {"Red", "Green", "Blue", null};
		List<String> colorList = Arrays.asList(colors);

		// set works and changes the underlying array too
		colorList.set(1, "Yellow");
		System.out.println("Array after set: " + Arrays.toString(colors));

		// Mutating the array also shows up in the list
		colors[0] = "Purple";
		System.out.println("List after array: " + colorList);

		// colorList.add("Black"); Throws UnsupportedOperationException
		// colorList.remove(0); Throws UnsupportedOperationException
	}
}

