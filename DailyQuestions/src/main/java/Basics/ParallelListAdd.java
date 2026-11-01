package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelListAdd {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        IntStream.rangeClosed(1, 100)
                .parallel()
                .forEach(ans::add);
        System.out.println(ans.size());
    }
}
