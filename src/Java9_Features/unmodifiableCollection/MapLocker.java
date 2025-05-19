package Java9_Features.unmodifiableCollection;

import java.util.Map;

public class MapLocker {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 85);
        System.out.println(scores);

        // scores.put("Charlie", 70); // ❌ Throws UnsupportedOperationException
    }
}
