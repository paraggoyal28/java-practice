package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
WAP to find average of all numbers
 */
public class AverageNums {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        long avg = nums.stream().reduce(0, Integer::sum)/ (long) nums.size();
        System.out.println("Average of given numbers: " + avg);

        double avg2 = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average of given numbers: " + avg2);
    }
}
