package StreamsPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> inputStrings = List.of("Helloworld", "Heyman", "Orange", "Papaya", "Banana", "Guava");
        Map<Integer, List<String>>
            groupedByLengths = inputStrings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLengths);
    }
}
