package Java9_Features.streamAPI_9_Enhacement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapCollector {
    public static void main(String[] args) {
        Map<String, List<String>> students = Map.of(
            "ClassA", List.of("Alice", "Adam"),
            "ClassB", List.of("Bob", "Bella"),
            "ClassC", List.of("Charlie", "Cathy")
        );

        List<String> allNames = students.entrySet().stream()
                .collect(Collectors.flatMapping(
                        entry -> entry.getValue().stream(),
                        Collectors.toList()
                ));

        System.out.println("All Names: " + allNames);
    }
}
