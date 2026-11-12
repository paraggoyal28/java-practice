package Basics;

public class StaticSyncDemo {
    public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(CounterStatic::increment);
		Thread t2 = new Thread(CounterStatic::increment);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
    }
}

class CounterStatic {
	static int count = 0;

	static void increment() {
		synchronized (CounterStatic.class) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			count++;
			System.out.println(count);
		}
	}
}
