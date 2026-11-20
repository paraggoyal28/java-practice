package Collections_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionFrequencyDemo {
	public static void main(String[] args){
		List<String> tags = List.of("java", "c++", "java", "rust", "java", "python");

		int javaCount = Collections.frequency(tags, "java");
		int rustCount = Collections.frequency(tags, "rust");

		System.out.println("java count: " + javaCount);
		System.out.println("rust count: " + rustCount);

		// Works on any collection (e.g set -> returns 1 if present, 0 if not
		Set<Integer> uniqueNums = Set.of(10, 20, 30);
		System.out.println("20 in set: " + Collections.frequency(uniqueNums, 20));

		List<String> withNulls = Arrays.asList("a", null, "b", null);
		System.out.println("null count: " + Collections.frequency(withNulls, null));
	}
}
