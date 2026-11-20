package Collections_17;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		int i, j, k;

		// Find index of beginning of last name
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

		if (k == 0) {
			return aStr.compareToIgnoreCase(bStr);
		} else {
			return k;
		}
	}
}

public class TreeMapDemo2 {
	public static void main(String[] args){
		TreeMap<String, Double> tm = new TreeMap<>(new TComp());

		// Put elements to a map
		tm.put("John Doe", 3443.34);
		tm.put("Tom Smith", 123.22);
		tm.put("Jane Baker", 1373.34);
		tm.put("Tom Hall", 98.34);
		tm.put("Ralph Smith", -19.08);

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		// Display the elements
		for (Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey() + " ");
			System.out.println(me.getValue());
		}

		System.out.println();

		// Deposit 1000 into John Doe's account
		tm.compute("John Doe", (name, balance)  -> balance == null ? 0: balance + 1000);

		System.out.println("John Doe's new balance: " + tm.get("John Doe"));

	}
}
