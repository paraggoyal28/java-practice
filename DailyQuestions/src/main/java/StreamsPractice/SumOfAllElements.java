package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long sum = numbers.stream().reduce(0, Integer::sum);
        long product = numbers.stream().reduce(1, (a, b) -> {
            System.out.println(a);
            return a * b;
        });
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
    }
}
