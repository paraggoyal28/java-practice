package Collections_17;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
    	int i, j;

		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
	}
}

class CompThenByFirstName implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		return aStr.compareToIgnoreCase(bStr);
	}
}

public class TreeMapDemo2A {
	public static void main(String[] args){
		CompLastNames compLN = new CompLastNames();
		Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

		// Create a tree map
		TreeMap<String, Double> tm =
				new TreeMap<>(compLastThenFirst);

		// Put elements to the map
		tm.put("John Doe", 3434.45);
		tm.put("Tom Smith", 123.23);
		tm.put("Jane Baker", 1278.34);
		tm.put("Tom Hall", 34.34);
		tm.put("Ralph Smith", -19.23);

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> me: set) {
			System.out.println(me.getKey() + " ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}
}
