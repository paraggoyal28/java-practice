package Collections_17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.put(2, 3);
		mp.put(4, 7);
		System.out.println(mp.put(4, 8));
		System.out.println(mp.get(4));
		System.out.println(mp.putIfAbsent(4, 10));
		System.out.println(mp.get(4));
		System.out.println(mp.put(5, 9));
		Integer res = mp.compute(5, (k, v) -> v + 8);
		Integer res4 = mp.merge(4, 6, (oldVal, newval) -> oldVal * newval);
		Integer res2 = mp.computeIfAbsent(4, (k) -> 8);
		Integer res3 = mp.computeIfPresent(4, (k, v) -> v);
		Set<Integer> keys = mp.keySet();
		Collection<Integer> values = mp.values();
		Set<Map.Entry<Integer, Integer>> entries = mp.entrySet();

		System.out.println(keys);
		System.out.println(values);
		System.out.println(entries);
		//keys.add(90);
		mp.put(90, 890);
		System.out.println(keys);
		System.out.println(values);
		System.out.println(entries);


		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

		Map<Integer, Integer> copyMp = Map.copyOf(mp);
		// copyMap.put(1, 2);
		Map<Integer, Integer> myMap = Map.of(1, 2, 3, 4, 5, 6);
		System.out.println(myMap);

		Map<Integer, Integer> mpFromEntries = Map.ofEntries(
					Map.entry(1, 2),
				Map.entry(2, 3));
		// copyMp.put(3, 4);  UnsupportedOperationException
		mp.forEach((k, v) ->  {
				System.out.println("Key: " + k + " and value: " + v);});
		System.out.println(mpFromEntries);

		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("apple", 1);
		System.out.println(wordCounts.merge("apple", 1, Integer::sum)); // value present
		//System.out.println(wordCounts.merge("kiwi", 1, Integer::sum)); // value absent
		System.out.println(wordCounts.merge("kiwi", 1, (a, b) -> null)); // value absent

		System.out.println(wordCounts);
		wordCounts.merge("banana", 2, Integer::compareTo);
		System.out.println(wordCounts);

		wordCounts.compute("kiwi", (fruit, count) -> count == null ? 1: count + 1);
		System.out.println(wordCounts);

		Map<String, Integer> scores = new HashMap<>();
		scores.put("alice", 10);
		scores.put("Bob", 5);
		System.out.println(scores);
		scores.compute("alice", (user, score) -> (score == null) ? score:  score + 1);
		scores.compute("Bob", (user, score) -> (score < 10) ? null: score);
		System.out.println(scores);
	}
}
