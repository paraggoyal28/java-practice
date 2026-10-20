package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class SumEven {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        long sum = nums.stream().filter(n -> n%2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum is: " + sum);
    }
}
