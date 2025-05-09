package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class MinExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Bob", "Alice");
        Optional<String> min = names.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println); // Alice
    }
}
