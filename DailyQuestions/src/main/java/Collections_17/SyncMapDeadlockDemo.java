package Collections_17;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class SyncMapDeadlockDemo {
	public static void main(String[] args) throws InterruptedException {
		Map<String, Integer> mapA = Collections.synchronizedMap(new HashMap<>());
		Map<String, Integer> mapB = Collections.synchronizedMap(new HashMap<>());

		mapA.put("k1", 1);
		mapB.put("k2", 2);

		// Thread 1: holds lock on mapA, then tries to acquire lock on mapB
		Thread t1 = new Thread(() -> {
			synchronized(mapA) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {

				}
				System.out.println(Thread.currentThread().getName() + "Inside mapA");
				for (Map.Entry<String, Integer> entry: mapA.entrySet()) {
					mapB.put(entry.getKey(), entry.getValue()); // acquire mutex of mapB
				}
				System.out.println(Thread.currentThread().getName() + "exited");
			}
		});

		// Thread 2: holds lock on mapB; then tries to acquire lock on mapA
		Thread t2 = new Thread(() -> {
			synchronized (mapB) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "Inside mapB");
				mapA.put("fromb", 99); // tries to acquire mutex of mapA -> DEADLOCK
				System.out.println(Thread.currentThread().getName() + "exited");

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
