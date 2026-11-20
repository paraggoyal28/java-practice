package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableWrappersDemo {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>(List.of("READ", "WRITE"));
		List<String> readOnlyList = Collections.unmodifiableList(stringList);

		Set<String> backingSet = new HashSet<>(Set.of("DEV", "QA"));
		Set<String> readOnlySet = Collections.unmodifiableSet(backingSet);

		Map<String, String> backingMap = new HashMap<>();
		backingMap.put("env", "staging");
		Map<String, String> readOnlyMap = Collections.unmodifiableMap(backingMap);

		//readOnlyList.add("DELETE"); // UnsupportedOperationException

		// Mutating the backing collection is reflected through the unmodifiable view!
		stringList.add("EXECUTE");
		System.out.println("Read only view after backing mutation: " + readOnlyList);

		backingMap.put("mode", "light");
		System.out.println("Read only set: " +  readOnlySet);
		System.out.println("Read only map: " + readOnlyMap);

	}
}
