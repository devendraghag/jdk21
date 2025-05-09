package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Bob", "Charlie");
        List<String> filtered = names.stream()
                                     .filter(name -> name.length() > 2)
                                     .collect(Collectors.toList());
        System.out.println(filtered); // [Alice, Charlie]
    }
}
