package Basics;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		// Add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("E");
		hs.add("D");
		hs.add("C");

		System.out.println(hs);
	}
}
