package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.stream()
             .sorted()
             .forEach(System.out::println); // Outputs in alphabetical order
    }
}
