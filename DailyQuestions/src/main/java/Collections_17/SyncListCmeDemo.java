package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncListCmeDemo {
	public static void main(String[] args) throws InterruptedException {
		List<String> syncList = Collections.synchronizedList(new ArrayList<>());
		for (int i = 0; i < 1_000; ++i) {
			syncList.add("item-" + i);
		}

    // Thread1-Iterating without synchronizing on syncList
    Thread reader =
        new Thread(() -> {
          synchronized (syncList) {
            for (String item : syncList) {
              // throws ConcurrentModificationException
              System.out.println(item);
            }
          }
        });

		// Thread 2: Mutating the list concurrently
		Thread writer = new Thread(() -> {
			for (int i = 0; i < 1_000; ++i) {
				syncList.add("extra-" + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});

		writer.start();
		Thread.sleep(20);
		reader.start();
		try {
		    reader.join();
			writer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
