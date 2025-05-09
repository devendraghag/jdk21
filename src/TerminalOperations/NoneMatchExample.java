package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        boolean result = names.stream().noneMatch(name -> name.startsWith("Z"));
        System.out.println("No name starts with Z? " + result); // true
    }
}
