package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
             .skip(2)
             .forEach(System.out::println); // Outputs: Charlie, David
    }
}
