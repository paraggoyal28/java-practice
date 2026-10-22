package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersInEvenOdd {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 8, 6, 9, 11, 23, 33, 44);
        Map <Boolean, List<Integer>>
            evenOddList = integerList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("Even numbers: " + evenOddList.get(true));
        System.out.println("Odd numbers: " + evenOddList.get(false));
    }
}
