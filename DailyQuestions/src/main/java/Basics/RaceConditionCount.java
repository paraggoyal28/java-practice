package Basics;

class CounterNonAtomic {
	public int count = 0;

	// non-atomic operation
	// bound to race condition
	synchronized void increment() {
		count++; // only one thread can execute due to synchronized
	}
}

public class RaceConditionCount {
	public static void main(String[] args) throws InterruptedException {
		CounterNonAtomic counterNonAtomic = new CounterNonAtomic();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10_000; ++i) {
				counterNonAtomic.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 10_000; ++i) {
				counterNonAtomic.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(counterNonAtomic.count);
	}
}
