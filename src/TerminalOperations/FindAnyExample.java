package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Optional<String> any = names.stream().findAny();
        any.ifPresent(System.out::println); // Any one element
    }
}
