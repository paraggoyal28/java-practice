package Collections_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args){
		// create an array list
		ArrayList<String> s1 = new ArrayList<>();

		// Add elements to the array list
		s1.add("C");
		s1.add("A");
		s1.add("D");
		s1.add("B");
		s1.add("F");

		// Use iterator to display the contents of s1
		System.out.println("Original contents of s1:");
		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		//Modify objects being iterated
		ListIterator<String> litr = s1.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.println("Modified contents of a1:");
		itr = s1.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
		}
		System.out.println();

		// Now, display the list backwards
		System.out.println("Modified list backwards is: ");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.println(element + " ");
		}
		System.out.println();

	}
}
