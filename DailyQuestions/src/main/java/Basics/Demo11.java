package Basics;

public class Demo11 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "Thread-2");

        t1.setName("worker-1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        t2.start();


        System.out.println("Priority of T1 thread: " + t1.getPriority());

        /*
        currentThread() -> reference of current running thread
        Thread.Priority
        MAX_PRIORITY = 10
        MIN_PRIORITY = 1
        NORM_PRIORITY = 5

         */
    }
}
