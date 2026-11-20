package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRotateExample {
	public static void main(String[] args){
		List<String> items = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));

		Collections.rotate(items, 2);
		System.out.println("Right by 2: " + items);

		// Rotate left by 1 place
		Collections.rotate(items, -1);
		System.out.println("Left rotate by 1: " + items);

		// Rotate a sublist
		Collections.rotate(items.subList(1, 4), 1);
		System.out.println("Slice rotate: " + items);
	}
}
