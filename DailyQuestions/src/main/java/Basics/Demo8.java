package Basics;

public class Demo8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; ++i) {
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
                Thread.yield();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 10; ++i) {
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        // Thread.yield
        // OS can reject
        // Thread.yield does not put current thread go to WAITING,
        // TIMED_WAITING, BLOCKED
    }
}
