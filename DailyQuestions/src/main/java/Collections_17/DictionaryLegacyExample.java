package Collections_17;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class DictionaryLegacyExample {
	public static void main(String[] args){
		// Legacy Dictionary API (HashTable is its main implementation)
		Dictionary<String, Integer> portConfig = new Hashtable<>();

		// Insert / update entries (put returns the previous value or null)
		portConfig.put("http", 80);
		portConfig.put("https", 443);
		Integer oldHttp = portConfig.put("http", 8080);
		System.out.println("Previous http port: " + oldHttp);
		System.out.println("Current https port: " + portConfig.get("https"));
		System.out.println("Size: " + portConfig.size());

		Enumeration<String> keys = portConfig.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(" " + key + " -> " + portConfig.get(key));
		}

		// Remove entry
		Integer removed = portConfig.remove("http");
		System.out.println("Removed http port: " + removed);
		System.out.println("Is empty: " + portConfig.isEmpty());

		Map<String, Integer> modernConfig = Map.of("https", 443, "http", 8080);
		modernConfig.forEach((k, v) -> System.out.println("Map entry: " + k + " -> " + v));
	}
}
