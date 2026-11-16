import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("John Doe", Double.valueOf(3434.34));
		hm.put("Tom Smith", Double.valueOf(123.33));
		hm.put("Jane Baker", Double.valueOf(1376.87));
		hm.put("Tod Hall", Double.valueOf(99.22));
		hm.put("Ralph Smith", Double.valueOf(19.08));

		Set<Map.Entry<String, Double>> set = hm.entrySet();
		// Display the set
		for (Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getKey());
		}

		System.out.println();

		// Deposit 100 into John Doe's account
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);

		System.out.println("John Doe's new balance: ");
		System.out.println(hm.get("John Doe"));
	}
}
