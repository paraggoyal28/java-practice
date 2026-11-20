package Collections_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InPlaceReplaceAllDemo {
	public static void main(String[] args){
		List<String> words = new ArrayList<>(List.of("java", "stream", "collection"));
		words.replaceAll(String::toUpperCase); // UnsupportedOperationExample
    	System.out.println("Words: " + words);

		// Map.replaceAll update every value using (key, oldValue)
		Map<String, Integer> prices = new HashMap<>(Map.of("Book", 100, "Pencil", 10));
		//prices.put("Book", 100);
		//prices.put("Pencil", 10);

		prices.replaceAll((item, price) -> price + 10); // UnsupportedOperationExample
		System.out.println("Prices: " + prices);
	}
}
