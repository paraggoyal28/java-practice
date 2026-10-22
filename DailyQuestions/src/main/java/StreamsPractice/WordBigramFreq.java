package StreamsPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Java is a strongly typed programming language. Java is fun to learn. */
public class WordBigramFreq {
    public static void main(String[] args) {
        String sentence = "Java is !a strongly, t#yped p$rogramming language. Java is fun to work with.";

        String[] words = sentence.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" ");

        IntStream.range(0, words.length - 1)
                .mapToObj(i -> words[i] + " " + words[i+1])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);


    }
}
