package StreamsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String sentence = "java is strongly typed programming language";

        String reversedSentence = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed Sentence: " + reversedSentence);

        String reversedSentence2 = Arrays.stream(sentence.split(" "))
                .map(word -> Arrays.stream(word.split("")).reduce((acc, current) -> current + acc).get())
                .collect(Collectors.joining(" "));

        System.out.println("Reversed sentence2: " + reversedSentence2);
    }
}
