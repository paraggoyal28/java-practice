package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 19, 5, 6);
        Optional<Integer> maxValue = nums.stream()
                .reduce(Math::max);
        System.out.println("Maximum number: " + maxValue.get());
    }
}
