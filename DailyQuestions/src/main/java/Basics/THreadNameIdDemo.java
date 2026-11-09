package Basics;

public class THreadNameIdDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(() -> {
            System.out.println("My thread name is: " + Thread.currentThread().getName());
            System.out.println("My thread id is: " + Thread.currentThread().getId());
        });
        t1.start();
        t1.start();
    }
}
