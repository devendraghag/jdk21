package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        boolean result = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("Any name starts with A? " + result); // true

        List<Integer> values = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        System.out.println(values.stream().anyMatch(num -> num %21 == 0));
    }
}
