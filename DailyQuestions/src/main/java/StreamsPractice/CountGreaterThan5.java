package StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 7, 8, 10, 2, 20, 3, 34);
        long cnt = nums.stream().filter(n -> n > 5).count();
        System.out.println(cnt);
    }
}
