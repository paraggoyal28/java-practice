package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;

public class MostLongWord {
    public static void main(String[] args) {
        String sentence = "The quick, brown$ fox^ j#umped over  a lazy dog";
        String mostLongWord = Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z\\s]+", "")
                .split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Most length word: " + mostLongWord);
    }
}
