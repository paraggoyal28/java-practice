package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSwapExample {
	public static void main(String[] args){
		List<String> queue = new ArrayList<>(List.of("First", "Second", "Third", "Fourth"));

		// Swap elements 0 and 2
		Collections.swap(queue, 0, 2);
		System.out.println("After swap(0, 2): " + queue);

		Collections.swap(queue, 1, 1);
		System.out.println("After swap(1, 1): " + queue);

	}
}
