package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageWindow {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 8, 4, 9, 15, 16);
        int window = 2;
        List<Double> windowAverage = IntStream.range(0, nums.size() - (window - 1))
                .mapToObj(i -> nums.subList(i, i + window))
                .map(w ->
                w.stream().mapToInt(Integer::intValue).average().orElse(0.0)).toList();
        System.out.println(windowAverage);
    }
}
