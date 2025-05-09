package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        long count = names.stream().count();
        System.out.println("Count: " + count); // 3
    }
}
