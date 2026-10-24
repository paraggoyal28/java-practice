package Basics; 
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class SafeResourceHandShake {
    private final Lock lock = new ReentrantLock();

    public void accessResource() {
        try {
            // Attempt to acquire the lock for 1 second
            // instead of blocking indefinitely
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    System.out.println(Thread.currentThread().getName() + " processing safely");
                } finally {
                    lock.unlock(); // Always release lock in finally block
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " timed out waiting for lock. Deadlock avoided");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}