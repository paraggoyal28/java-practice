package StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSquares {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
    }
}
