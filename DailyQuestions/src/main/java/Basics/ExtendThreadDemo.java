package Basics;

class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class ThreadRunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running via runnable");
    }
}

public class ExtendThreadDemo {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        Thread threadViaRunnable = new Thread(new ThreadRunnableDemo());
        threadViaRunnable.start();
    }
}

// t1.start() -> asks OS to create a thread
// Thread t1 gets stack and program counter space
// Thread execute run method

