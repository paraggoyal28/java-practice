package StreamsPractice;

import java.util.Arrays;
import java.util.List;

/*
flatten a list of lists
 */
public class FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> nestedNums = Arrays.asList(Arrays.asList(1, 2, 3),
                                                        Arrays.asList(4, 3, 3),
                                                        Arrays.asList(8, 5, 9));
        nestedNums.stream().flatMap(List::stream).forEach(n -> System.out.print(n + " "));
    }
}
