package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class MaxExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Bob", "Alice");
        Optional<String> max = names.stream().max(Comparator.naturalOrder());
        max.ifPresent(System.out::println); // Charlie
    }
}
