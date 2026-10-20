package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 4, 9, 3, 8, 54, 7, 2);
        System.out.println("Numbers sorted in ascending order:");
        nums.stream().sorted().forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("Numbers sorted in descending order:");
        nums.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
