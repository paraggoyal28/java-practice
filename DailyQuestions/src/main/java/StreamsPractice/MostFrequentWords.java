package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWords {
    public static void main(String[] args) {
        String sentence = "quick brown fox jumped fox a quick dog over was quick in was to was side";
        Map<String, Long> freqMap = Arrays.stream(sentence.toLowerCase()
                .replaceAll("[^a-z\\s]+", "")
                .split(" ")).collect(Collectors.groupingBy(Function.identity(),
                    Collectors.counting()));
        List<Long> topThreeFrequencies = freqMap
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getValue).distinct().limit(3).toList();

        List<Map.Entry<String, Long>> mostFrequentWords
                    = freqMap.entrySet().stream().filter(entry ->
                    topThreeFrequencies.contains(entry.getValue()))
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();
        System.out.println(mostFrequentWords);
    }
}
