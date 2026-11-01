package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class FinalMutable {
    private final String name;
    private final int age;
    private final List<String> tasks;
    private final int[] nums;

    public FinalMutable() {
        this.name = null;
        this.age = 0;
        this.tasks = Collections.emptyList();
        this.nums = new int[1];
    }

    public FinalMutable(String name, int age, List<String> tasks, int[] another) {
        this.name = name;
        this.age = age;
        this.tasks = List.copyOf(tasks);
        this.nums = another.clone();
    }

   // public void setName(String name) {
    //    this.name = name;
   // }

    //public void setAge(int age) {
    //    this.age = age;
    //}
    public List<String> getTasks() {
        return this.tasks;
    }

    public int[] getNums() {
        return this.nums.clone();
    }


    @Override
    public String toString() {
        return "[Name]: " + name + ",[Age]: " + age + ",[Tasks]: " + String.join(", ", tasks) +
                "[Nums]: " + print(this.nums);
    }

    public String print(int[] nums) {
        StringBuilder res = new StringBuilder();
        for (int num: nums) {
            res.append(num).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Walk");
        originalList.add("Sleep");

        FinalMutable first = new FinalMutable("Alex", 20, originalList, new int[]{1, 2, 3});
        System.out.println("Initial: " + first);

      //  first.getTasks().add("Work");
        first.getNums()[0] = 44;
    //    finalMutable.setAge(24);
    //    finalMutable.setName("Arun");
        System.out.println("Modified: "  + first);
    }
}

