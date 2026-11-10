package Basics;

public class Demo9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running...");
            }
        });

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
    }

    /*

    Thread --> interrupt() (default false)
    interrupt flag set to true
    t1.interrupt() - changes the interrupt flag of a thread from false(default) to true
    ---> We can make a thread run until a condition
    ---> cancelling a long running tssk
    ----> Used to stop thread pool
    isInterrupted() -> returns boolean
    interrupted() -> return interrupt flag value (T/F) but also sets the interrupt flag to false
    sleep(), join(), wait(): Timed waiting, WAITING --> interrupt call throws interrupted exception
    if catch block no code is present than the thread keep on running
    */
}
