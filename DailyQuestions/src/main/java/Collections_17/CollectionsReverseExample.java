package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseExample {
	public static void main(String[] args){
		List<String> steps = new ArrayList<>(List.of("First", "Second", "Third", "Fourth", "Five"));

		System.out.println(steps);
		Collections.reverse(steps);
		System.out.println(steps);

		List<String> mainList = new ArrayList<>(List.of("First", "Second", "Third", "Fourth", "Fifth"));

		System.out.println(Collections.indexOfSubList(mainList, List.of("First", "Third")));
	}
}
