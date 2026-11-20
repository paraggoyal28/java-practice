package Collections_17;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingletonCollectionsDemo {
	public static void main(String[] args){
		// 1. Collections.singletonList(element) - Immutable list of size 1
		List<String> singleRole = Collections.singletonList("ADMIN");
		System.out.println("Singleton list: " + singleRole);

		// 2. Collections.singletonMap(key, value)
		Map<String, Integer> defaultLimit = Collections.singletonMap("maxRetries", 3);
		System.out.println("SingletonMap : " + defaultLimit); // {maxRetries=3}

		// 3. Collections.singleton(element) -> immutable Set of size 1
		Set<String> allowedEnv = Collections.singleton("PROD");
		System.out.println("SingletonSet : " + allowedEnv);
	}
}
