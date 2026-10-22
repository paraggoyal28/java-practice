package StreamsPractice;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class MostFreqChar {
    public static void main(String[] args) {
        String input = "bananaFruitWithOrange";
        Map.Entry<Character, Long> mostFrequentCharacter =input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .orElse(null);
        System.out.print(mostFrequentCharacter);
    }
}
