package Basics;

public class Demo2 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; ++i) {
                if (i%2 == 0) {
                    System.out.println("T1: " + i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 100; ++i) {
                if (i % 2 != 0) {
                    System.out.println("T2: " + i);
                }
            }
        });

        Thread myThread = new Thread(() -> {
            System.out.println("Name of the current thread is: " + Thread.currentThread().getName());
            System.out.println("Main Thread state: " + mainThread.getState());
        });

        System.out.println("Thread state: " + myThread.getState());

        // Runnable stage
        myThread.start();
        System.out.println("Thread state: " + myThread.getState());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("Thread state: " + myThread.getState());

    }
}
