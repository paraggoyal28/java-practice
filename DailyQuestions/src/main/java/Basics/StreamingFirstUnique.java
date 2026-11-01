package Basics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class StreamingFirstUnique {
    public static class Processor {

        HashMap<String, Integer> freq = new HashMap<>();
        Deque<String> singleFreqQ = new ArrayDeque<>();

        public void add(String element) {
            freq.put(element, freq.getOrDefault(element, 0) + 1);

            if (freq.get(element) == 1) {
                singleFreqQ.offerLast(element);
            }
            // remove duplicate elements from the front of queue
            while (!singleFreqQ.isEmpty() &&
                        freq.get(singleFreqQ.peekFirst()) > 1) {
                singleFreqQ.pollFirst();
            }
        }

        public String getFirstUnique() {
            return singleFreqQ.isEmpty() ? null : singleFreqQ.peekFirst();
        }
    }

    public static void main(String[] args) {
        String[] elements = {"a", "b", "c", "a", "t", "d", "t", "b", "c"};
        Processor p = new Processor();

        for (String element: elements) {
            p.add(element);
            System.out.println("First unique element till now: " + p.getFirstUnique());

        }
        System.out.println("First unique element till now: " + p.getFirstUnique());

    }
}
