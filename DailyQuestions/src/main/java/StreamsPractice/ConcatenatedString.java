package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenatedString {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("abc", "hello", "World", "Hanuman", "ganesh");
        String concatenated = strs.stream().collect(Collectors.joining(",", "[", "]"));
        String concatednated2 = String.join("," ,strs);
        System.out.println("Concatenated String: " + concatednated2);
    }
}
