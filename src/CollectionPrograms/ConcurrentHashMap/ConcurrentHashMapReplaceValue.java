package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapReplaceValue {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> wordCount = new ConcurrentHashMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);

        // Replace value only if the key exists
        wordCount.replace("apple", 4);

        System.out.println("Updated Word Count: " + wordCount);
    }
}
