package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapComputeIfPresent {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> wordCount = new ConcurrentHashMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);

        // If the key exists, compute a new value
        wordCount.computeIfPresent("apple", (key, val) -> val + 1);  // Increases the count of apple

        System.out.println("Updated Word Count: " + wordCount);
    }
}
