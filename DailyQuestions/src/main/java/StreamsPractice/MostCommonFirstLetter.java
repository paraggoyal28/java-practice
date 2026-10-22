package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Alice", "Bob", "Almango", "Alpine", "Apricot", "Aman");

        Map.Entry<Character, Long> mostFreqLetters =
                words.stream().map(letter -> letter.charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .orElse(null);
        System.out.println(mostFreqLetters);
    }
}
