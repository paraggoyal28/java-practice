package Basics;

public class Demo12 {
    public static void main(String[] args) {
        /*
        daemon threads - background running threads
        threads - user and daemon threads
        Application does not exits  if a single user thread  is not finishes
        Application exists if all threads currently are daemon.
        garbage collection - daemon threads
         */

        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Running...");
            }
        });

        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}
