package Collections_17;


import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorByLambda {
	public static void main(String[] args){
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

		ts.add("Alice");
		ts.add("Bob");
		ts.add("Charlie");
		ts.add("Bob");
		ts.add("David");
		ts.add("Denli");


		System.out.println(ts);
	}
}
