package Collections_17;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsShuffleDemo {
  public static void main(String[] args){
    List<String> deck = new ArrayList<>(List.of("Ace", "King", "Gueen", "Jack", "10"));

    Collections.shuffle(deck);
    System.out.println("Default shuffle: " + deck);

    // Seeded random for reproducable results (useful in tests/simulations)
    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
    Collections.shuffle(numbers, new Random(42L));
    System.out.println("Seeeded shuffle(42): " + numbers);

    // Secure random when unpredictable matters (eg. lotteries/raffles)
    List<String> players = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Diana"));
    Collections.shuffle(players, new SecureRandom());
	System.out.println("Secure shuffle: " + players);
  }
}
