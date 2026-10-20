package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class FirstGreaterThan10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 12, 3, 2, 11, 30);
        Integer firstNumberGreaterThanTen = nums.stream().filter(n -> n > 10)
                .sorted().findFirst().orElse(null);
        System.out.print(firstNumberGreaterThanTen);
    }
}
