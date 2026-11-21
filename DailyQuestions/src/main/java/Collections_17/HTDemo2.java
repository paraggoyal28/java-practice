package Collections_17;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
	public static void main(String[] args){
		Hashtable<String, Double> balance =
				new Hashtable<>();
		String str;
		double bal;

		balance.put("John Doe", 3434.34);
		balance.put("Tom Smith", 123.23);
		balance.put("Jane Baker", 1373.34);
		balance.put("Tod Hall", 99.34);
		balance.put("Ralph Smith", -23.23);

		// Show all balances in hashTable
		// First, get a set view of the keys
		Set<String> keys = balance.keySet();

		// Get an iterator
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			str = itr.next();
			System.out.println(str + ": " + balance.get(str));
		}

		System.out.println();

		// Deposit 1,000 into John Doe's account
		bal = balance.get("John Doe");
		balance.put("John Doe", bal + 1000);
		System.out.println("John Doe's new balance: " + balance.get("John Doe"));
	}
}
