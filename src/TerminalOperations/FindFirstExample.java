package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Optional<String> first = names.stream().findFirst();
        first.ifPresent(System.out::println); // Alice
    }
}
