package StreamsPractice;

import java.util.Arrays;
import java.util.List;

/*
Check if all numbers present in the list are positives
 */
public class CheckAllPositives {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, -2, 3, 4, 5, 6, -8);
        boolean allPositives = nums.stream().allMatch(n -> n > 0);
        System.out.println("All numbers in the given list are positives: " + allPositives);
        nums = Arrays.asList(1, 2, 3, 4, 5);
        allPositives = nums.stream().allMatch(n -> n > 0);
        System.out.println("All numbers in the given list are positives: " + allPositives);
    }
}
