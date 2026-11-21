package Collections_17;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
	public static void main(String[] args){
		Hashtable<String, Double> balance =
				new Hashtable<>();
		Enumeration<String> names;
		String str;
		double bal;

		balance.put("John Doe", 3434.34);
		balance.put("Tom Smith", 123.23);
		balance.put("Jane Baker", 1378.90);
		balance.put("Tod Hall", 99.23);
		balance.put("Ralph Smith", -19.23);

		// Show all balances in hashtable
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + " " + balance.get(str));
		}

		System.out.println();

		// Deposit 1,000 into John Doe's balance account
		bal = balance.get("John Doe");
		balance.put("John Doe", bal + 1000);
		System.out.println("John  Doe's new balance: " + balance.get("John Doe"));

	}
}
