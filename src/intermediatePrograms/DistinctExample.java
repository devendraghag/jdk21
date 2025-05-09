package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        names.stream()
             .distinct()
             .forEach(System.out::println); // Outputs: Alice, Bob, Charlie
    }
}
