package StreamsPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByElements {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange", "apple", "banana", "guava", "kiwi");

        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Fruits counting: " + fruitCount);
    }
}
