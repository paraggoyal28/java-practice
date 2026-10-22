package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesOfAWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Guava", "Orange", "Apple", "Orange", "Apple", "Banana");
        Map<String, Long>
            wordCount =
                words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);
    }
}
