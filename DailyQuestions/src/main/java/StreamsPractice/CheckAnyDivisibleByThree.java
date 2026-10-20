package StreamsPractice;

import java.util.Arrays;
import java.util.List;

/*
Check if any number in the given list divisible by three
 */
public class CheckAnyDivisibleByThree {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 2, 4, 5, 8, 10, 14);
        boolean anyNumberDivisibleByThree = nums.stream().anyMatch(n -> n%3 == 0);
        System.out.println("Any number divisible by three in given list: " + anyNumberDivisibleByThree);
    }
}
