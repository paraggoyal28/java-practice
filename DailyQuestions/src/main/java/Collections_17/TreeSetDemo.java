package Collections_17;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();

		ts.add("C");
		ts.add("D");
		ts.add("B");
		ts.add("F");
		ts.add("A");
		System.out.println(ts);
		System.out.println(ts.subSet("B", "F"));
		System.out.println(ts.headSet("C", true));
		System.out.println(ts.tailSet("A", false));
		System.out.println(ts.higher("C"));
		System.out.println(ts.lower("C"));
		System.out.println(ts.ceiling("C"));
		System.out.println(ts.floor("C"));

	}
}
