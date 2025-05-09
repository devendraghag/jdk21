package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        long count = names.stream()
                          .peek(System.out::println) // Debugging each element
                          .count(); // Triggers the stream
        System.out.println("Count: " + count);
    }
}
