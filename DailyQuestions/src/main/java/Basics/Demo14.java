package Basics;

public class Demo14 {
    public static void main(String[] args) {
		TestShared test = new TestShared();

		Thread t1 = new Thread(test::show);

		Thread t2 = new Thread(test::show);

		t1.start();
		t2.start();
	}
}

class TestShared {
	synchronized void show() {
		System.out.println(Thread.currentThread().getName() + " Inside show");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		System.out.println(Thread.currentThread().getName() + " Show Finished");
	}
}
