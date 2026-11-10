package Basics;

public class Demo13 {
    static  volatile boolean flag = false;

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true; // thread t1 cache true -> put in RAM true
        });

        Thread t2 = new Thread(() -> {
            while (!flag) { // thread t2 cache false t2 does not read the RAM
                // do nothing
            }
            System.out.println("Thread 2 finished...");
        });

        t1.start();
        t2.start();
    }
}
