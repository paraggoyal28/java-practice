package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 9);
        nums.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
