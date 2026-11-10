package Basics;

public class VolatileVisibilityDemo {

    // 1. Try running with 'boolean shutdownRequested = false;' (Will likely hang)
    // 2. Then try running with 'volatile boolean shutdownRequested = false;' (Will terminate cleanly)
    private static volatile boolean shutdownRequested = false;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            long iterations = 0;
            System.out.println("Worker thread started. Waiting for shutdown signal...");

            // Tight loop: without volatile, JIT optimization or CPU caching
            // can cause this thread to read a stale cached value of 'shutdownRequested'.
            while (!shutdownRequested) {
                iterations++;
                // NOTE: Putting a statement like System.out.println() or Thread.sleep()
                // here introduces a memory barrier which can mask the visibility bug,
                // so keep the loop tight!
            }

            System.out.println("Worker thread stopped successfully after " + iterations + " iterations.");
        });

        worker.start();

        // Let the worker run for 1 second
        Thread.sleep(1000);

        System.out.println("Main thread is setting shutdownRequested to true.");
        shutdownRequested = true;

        // Wait for the worker to finish
        worker.join();
        System.out.println("Main program exiting.");
    }
}