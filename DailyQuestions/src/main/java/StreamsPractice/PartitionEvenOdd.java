package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 3, 1, 4, 5, 8, 23, 44);
        Map<Boolean, List<Integer>> output =
             intList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("Even Numbers: " + output.get(true));
        System.out.println("Odd Numbers: " + output.get(false));

    }
}
