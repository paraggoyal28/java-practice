package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumsSquared {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 8, 3);
        Integer evenSquareSum = numbers.stream().filter(n -> n%2 == 0).map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squared even numbers: " + evenSquareSum);
    }
}
