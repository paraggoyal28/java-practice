package StreamsPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "javaprogramming";
        Character mostFrequentChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.printf("Most frequent character %c", mostFrequentChar);

    }
}
