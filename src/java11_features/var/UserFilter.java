package java11_features.var;

import java.util.List;
import java.util.stream.Collectors;

public class UserFilter {
    public static void main(String[] args) {
        var users = List.of("Alice", "Bob", "Charlie", "Dave");

        var filtered = users.stream()
                            .filter(u -> u.startsWith("A") || u.startsWith("B"))
                            .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
