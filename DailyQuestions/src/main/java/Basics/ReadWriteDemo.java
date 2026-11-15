package Basics;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteDemo {

  public static void main(String[] args) {
	  SharedResource sharedResource = new SharedResource();

	  Thread r1 = new Thread(sharedResource::read);
	  Thread r2 = new Thread(sharedResource::read);
	  Thread r3 = new Thread(sharedResource::read);

	  Thread w1 = new Thread(() -> sharedResource.write(34));
	  Thread w2 = new Thread(() -> sharedResource.write(45));
	  Thread w3 = new Thread(() -> sharedResource.write(56));

	  r1.start();
	  r2.start();
	  r3.start();

	  w1.start();
	  w2.start();
	  w3.start();
  }
}

class SharedResource {
	private int value = 0;
	ReadWriteLock rwLock = new ReentrantReadWriteLock();
	Lock readLock = rwLock.readLock();  // shared
	Lock writeLock = rwLock.writeLock();  // exclusive

	public int read() {
		readLock.lock();

		try {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println(Thread.currentThread().getName() + " reads value as: " + value);
			return value;
    	} finally {
      		readLock.unlock();
		}
	}

	public void write(int newValue) {
		writeLock.lock();

		try {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			this.value = newValue;
			System.out.println(Thread.currentThread().getName() + " changes value to " + this.value);
		} finally {
			writeLock.unlock();
		}
	}

}