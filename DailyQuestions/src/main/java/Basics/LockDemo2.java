package Basics;

public class LockDemo2 {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Thread t1 = new Thread(() -> bank.deposit());
		Thread t2 = new Thread(() -> bank.deposit());
		t1.start();
		t2.start();
	}
}

class Bank {
    Object lock1 = new Object();
	Object lock2 = new Object();

	void deposit() {
		synchronized(new Object()) {
			System.out.println("Deposit logic");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

	void withdraw() {
		synchronized(lock2) {
			System.out.println("Withdraw logic");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
