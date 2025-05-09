package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapDefaultValue {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("apple", 2);
        wordCount.put("banana", 3);

        int count = wordCount.getOrDefault("cherry", 0);  // Default value if key doesn't exist
        System.out.println("Cherry count: " + count);
    }
}
