package Collections_17;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
	public static void main(String[] args){
		// Creates an array list for doubles
		ArrayList<Double> vals = new ArrayList<>();
		vals.add(1.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(2.0);

		// Use tryAdvance() to display contents of the vals
		System.out.println("Contents of vals: ");
		Spliterator<Double> splitIterator = vals.spliterator();
    	while (splitIterator.tryAdvance(n -> System.out.println(n)));
		System.out.println();

		// create new list that contains square roots
		splitIterator = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while (splitIterator.tryAdvance(n -> sqrs.add(Math.sqrt(n))));

		//Use forEachRemaining to display contents of sqrts
		System.out.println("Contents of sqrts:");
		splitIterator = sqrs.spliterator();
		splitIterator.forEachRemaining(n -> System.out.println(n));
		System.out.println();
	}
}
