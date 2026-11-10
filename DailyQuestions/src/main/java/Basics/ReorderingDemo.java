package Basics;


class Shared {
    int x = 0;
    boolean flag = false;

    void change() {
        x = 10;
        x++;
        x++;
        x++;
        x++;
        x++;
        x++;
        x++;
        flag = true;
    }

    void print() {
        if (flag) {
            if(x != 17) {
                System.out.println("Violation found! Error");
            }
            System.out.println(x);
        }
    }
}

public class ReorderingDemo {

    public static void main(String[] args) {
        int iterations = 0;
        while (iterations < 10_000) {
            Shared shared = new Shared();

            Thread t1 = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shared.change();
            });

            Thread t2 = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shared.print();
            });


            t1.start();
            t2.start();

            iterations++;
        }

    }
}
