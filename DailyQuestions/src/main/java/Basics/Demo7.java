package Basics;

public class Demo7 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread starts:");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread-0 starts");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();

        t1.join(1000);
        // t1.join() - main thread waits for t1 to finish its execution
        // t1.join(1000) - main thread waits for t1 to finish its execution within 1000ms

        /*
        Main thread -> WAITING -> RUNNABLE -> TERMINATED
        T1 -> RUNNABLE -> TERMINATED
         */

        /*
        yield - not used in production

         */

        // similar thread with same priority is given the CPU time from the current given thread

        System.out.println("Main Thread ends");
    }
}
