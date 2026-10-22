package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum CharType {
    DIGIT, UPPERCASE, LOWERCASE, OTHER
}

public class GroupChar {
    public static void main(String[] args) {
        String sentence = "Hello world 0ed889s by parag. Java is fun to work with.";
        Map<CharType, List<Character>> charGroup = sentence.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(GroupChar::findCharGroup));
        System.out.println(charGroup);
    }

    private static CharType findCharGroup(char ch) {
        if (Character.isUpperCase(ch)) return CharType.UPPERCASE;
        else if (Character.isLowerCase(ch)) return CharType.LOWERCASE;
        else if (Character.isDigit(ch)) return CharType.DIGIT;
        else return CharType.OTHER;
    }
}
