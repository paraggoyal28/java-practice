package Collections_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Person {
  int age;
  String name;
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
	  return "[name]= " + name + ", [age]=" + age;
  }
}

public class CollectionsCopyExample {
  public static void main(String[] args) {
    List<String> src = List.of("Alpha", "Beta", "Gamma");

    // dest must always have at least src.size() elements
    List<String> dest = new ArrayList<>(List.of("X", "Y", "Z", "W"));

    System.out.println("Collections containing disjoint elements " + Collections.disjoint(dest, src));

    List<Integer> empty = Collections.emptyList();
    List<Person> allOnes = new ArrayList<>(Collections.nCopies(10, new Person("Parag", 12)));
    System.out.println("All Ones: " + allOnes);
	Collections.fill(allOnes, new Person("Vinod", 45));
	System.out.println("All Ones: " + allOnes);
	allOnes.get(0).name = "Renu";
	System.out.println("All Ones: " + allOnes);
    //		empty.add(123);

    Map<String, Integer> emptyMap = Collections.emptyMap();
    //emptyMap.put("Abc", 123);

    Set<String> emptySet = Collections.emptySet();
    //emptySet.add("Abc");

    System.out.println("Empty list " + empty);

    Collections.copy(dest, src);

    System.out.println("Collections containing disjoint elements " + Collections.disjoint(dest, src));


    System.out.println("src: " + src);
    System.out.println("dest: " + dest);
  }
}
