package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> namesList = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Charlie", "David")
        );
        namesList.stream()
                 .flatMap(List::stream)
                 .forEach(System.out::println); // Outputs each name individually
    }
}
