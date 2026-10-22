package StreamsPractice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "heymahe";
        Character singleFreqChar =
                input.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entrySet -> entrySet.getValue() == 1)
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElseThrow();
        System.out.printf("First non-repeating character: %c\n", singleFreqChar);
    }
}
