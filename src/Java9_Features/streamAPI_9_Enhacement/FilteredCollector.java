package Java9_Features.streamAPI_9_Enhacement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteredCollector {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.filtering(name -> name.startsWith("A") || name.startsWith("C"), Collectors.toList())
                ));

        System.out.println(result);
    }
}
