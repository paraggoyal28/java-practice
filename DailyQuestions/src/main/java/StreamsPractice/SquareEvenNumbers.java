package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = nums.stream().filter(n -> n%2 == 0)
                .map(n -> n * n).toList();
        System.out.println(result);
    }
}
