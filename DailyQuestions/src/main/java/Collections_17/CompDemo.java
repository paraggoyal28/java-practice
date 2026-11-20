package Collections_17;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {


	@Override
	public int compare(String aStr, String bStr) {
		return bStr.compareTo(aStr);
	}
}

public class CompDemo {
	public static void main(String[] args){
		TreeSet<String> ts = new TreeSet<>(new MyComp());

		ts.add("C");
		ts.add("A");
		ts.add("E");
		ts.add("B");
		ts.add("F");
		ts.add("D");

		for (String element: ts) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
