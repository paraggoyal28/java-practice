package Basics;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    public int count = 0;

    void increment() {
        count++;
    }
}

public class RaceDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; ++i) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_000; ++i) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.count);
    }
}
// Critical section
// void increment() {
//    count++; -> shared resource
// }
// Atomicity problem
// two operations in java - atomic, non-atomic
// count++ is atomic
// atomic operation either completes fully or not executes at all
// count++ is composed of three atomic operations
// read, count increment, and then write
// think of atomic operation as that is completed fully by a thread before the
// thread is context switched
/*
Account A   |    Account B
 |          |      |
 Bal -= 500 |   Bal += 500
If amount debited from Account A and not credited in Account B
If the whole operation is not atomic
if amount detected then context switched,
and the thread executing it got blocked, or context switched,
then the amount will be inconsistent, so we need to make
sure our operation is atomic

Two ways to solve this:
synchronized
AtomicInteger, AtomicDouble

atomic operation (x = 2)
Student s1 = new Student();
Non-atomic
x++, y--
x=x+5
Check - then - act
if (balance >= amount) {
    balance -= amount;
}
double d = 112.233;
(2 operations)
(d is 64 bits)
(write in two parts of 32 bits)



 */
