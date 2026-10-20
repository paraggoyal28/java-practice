package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    private static void print(Stream<?> stream) {
        stream.forEach((a) -> System.out.print(a + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        Stream<String> stream2 = names.stream();
        String[] namesArr = {"alice", "bob"};
        Stream<String> stream1 = Arrays.stream(namesArr);
        Stream<String> stream3 = Stream.of("alice", "bob");
        Stream<Double> doubleStream = Stream.generate(Math::random).limit(5);
        print(stream1);
        print(stream2);
        print(stream3);
        print(doubleStream);
    }
}
