package StreamsPractice;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + "(" + age + ")";
    }
}

public class AverageAgeEmployees {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 24),
                new Person("David", 28)
        );

        List<Person> people2 = Collections.emptyList();

        double averageAge = people.stream().mapToInt(Person::getAge).average().orElse(0.0);
        // 107/4 = 26.75
        double averageAgeEmpty = people2.stream().mapToInt(Person::getAge).average().orElse(0.0);

        System.out.println("Average age: " + averageAgeEmpty);
    }
}
