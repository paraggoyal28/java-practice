package Basics;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Main Thread ends");
    }

    // Thread.sleep(1000millis) -> TIMED_WAITING
    // InterruptedException -> Checked exception for thread.sleep
    // Thread.sleep -> don't release locks
}
