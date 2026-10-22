package StreamsPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

record User(int id, String name) {}

public class UserMap {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(2, "Alice"),
                new User(3, "Bob"),
                new User(5, "Om")
        );

        Map<Integer, String> groupById = users.stream()
                .collect(Collectors.toMap(User::id, User::name));

        Map<Integer, User> userMap = users.stream()
                .collect(Collectors.toMap(User::id, Function.identity()));
        System.out.println(groupById);
        System.out.println(userMap);
    }
}
