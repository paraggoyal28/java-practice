package Collections_17;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<>(Comparator.<String, String>comparing(a -> a.split(" ")[1])
				.thenComparing(Comparator.naturalOrder()));

		// Put elements to the amp
		tm.put("John Doe", 3434.34);
		tm.put("Tom Smith", 123.23);
		tm.put("Jane Baker", 1478.23);
		tm.put("Tod Hall", 23.22);
		tm.put("Ralph Smith", -19.80);

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		// Display the elements
		for (Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey() + " ");
			System.out.println(me.getValue());
		}

		System.out.println();

		// Deposit 1000 into John Doe's account
		tm.compute("John Doe", (name, balance) -> balance == null ? 1000: balance + 1000);
		System.out.println("John Doe's new balance: " + tm.get("John Doe"));

	}
}
