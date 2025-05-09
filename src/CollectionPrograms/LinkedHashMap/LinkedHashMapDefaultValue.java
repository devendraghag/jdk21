package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapDefaultValue {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);

        int count = wordCount.getOrDefault("cherry", 0);  // Default value if key doesn't exist
        System.out.println("Cherry count: " + count);
    }
}
