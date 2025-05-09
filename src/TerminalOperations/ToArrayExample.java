package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Object[] array = names.stream().toArray();
        System.out.println(Arrays.toString(array)); // [Alice, Bob, Charlie]
    }
}
