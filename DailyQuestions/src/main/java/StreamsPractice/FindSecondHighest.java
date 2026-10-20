package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
find second highest number in an integer array
 */
public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 23, 1, 2, 3, 4, 5);
        Integer secondHighest = nums.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        System.out.println("Second Highest Number: " + secondHighest);
    }
}
