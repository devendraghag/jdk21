package Java9_Features.unmodifiableCollection;

import java.util.Map;

public class BigMapBuilder {
    public static void main(String[] args) {
        Map<String, String> countries = Map.ofEntries(
                Map.entry("IN", "India"),
                Map.entry("US", "United States"),
                Map.entry("UK", "United Kingdom"),
                Map.entry("JP", "Japan")
        );

        System.out.println(countries);
    }
}
