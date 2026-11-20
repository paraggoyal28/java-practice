package Collections_17;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
	int capacity;
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity should be greater than zero");
		}
		this.capacity = capacity;
	}

	@Override
	public boolean removeEldestEntry(Map.Entry<K, V> entry) {
		return size() > capacity;
	}

}

public class LRUCacheDemo {
	public static void main(String[] args){
		LRUCache<String, Integer> myCache = new LRUCache<>(3);
		myCache.put("ABC", 1);
		myCache.put("DEF", 2);
		myCache.put("PQR", 3);
		System.out.println(myCache);
		System.out.println(myCache.get("ABC"));
		System.out.println(myCache);
		myCache.put("POL", 4);
		System.out.println(myCache);
	}
}
