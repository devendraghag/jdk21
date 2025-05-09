package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
             .limit(2)
             .forEach(System.out::println); // Outputs: Alice, Bob
    }
}
