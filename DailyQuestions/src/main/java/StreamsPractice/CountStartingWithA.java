package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class CountStartingWithA {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Avacado", "Orange", "Mango", "Pineapple", "Apricot");
        long AStartingFruitsCnt = fruits.stream()
                .filter(str -> str.startsWith("Ap"))
                .count();
        System.out.println(AStartingFruitsCnt);
    }
}
