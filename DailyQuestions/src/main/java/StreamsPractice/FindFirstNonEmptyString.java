package StreamsPractice;

import java.util.Arrays;
import java.util.List;

/*
Find first non empty string
 */
public class FindFirstNonEmptyString {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("", "", "", "", "");
        String firstNonEmpty = input.stream().filter(str -> !str.isEmpty())
                .findFirst().orElse("all empty strings");
        System.out.println("First non empty string: " + firstNonEmpty);
    }
}
