package Basics;

class TestLock {
	public void m1() {
    	synchronized (this) {
		  System.out.println(Thread.currentThread().getName() + " m1 entered");
		  try {
			Thread.sleep(2000);
		  } catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		  }
		  System.out.println(Thread.currentThread().getName() + " m1 exited");
		}
	}

	public void m2() {
		synchronized (this) {
		  System.out.println(Thread.currentThread().getName() + " m2 entered");
		  try {
			Thread.sleep(2000);
		  } catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		  }
		  System.out.println(Thread.currentThread().getName() + " m2 exited");
		}
	}
}

public class LockDemo1 {
	public static void main(String[] args) throws InterruptedException {
		TestLock testLock = new TestLock();
		TestLock testLock1 = new TestLock();
		TestLock testLock2 = new TestLock();

		Thread t1 = new Thread(testLock::m1);
		Thread t2 = new Thread(testLock::m2);


		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
