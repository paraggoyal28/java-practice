package Basics;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class SumParallelDemo {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(atomicLong::addAndGet);
        System.out.println(atomicLong);

    }
}
