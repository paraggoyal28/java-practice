package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReplaceAllExample {
	public static void main(String[] args){
		List<String> statuses = new ArrayList<>(List.of("PENDING", "FAILED", "PENDING", "COMPLETED"));

		// Replace all PENDING To In Progress
		boolean changed = Collections.replaceAll(statuses, "PENDING", "IN_PROGRESS");

		System.out.println("Changed: " + changed);
		System.out.println("List:" + statuses);
	}
}
