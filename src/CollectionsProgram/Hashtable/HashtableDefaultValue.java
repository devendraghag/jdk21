package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableDefaultValue {
    public static void main(String[] args) {
        Hashtable<String, Integer> wordCount = new Hashtable<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);

        int count = wordCount.getOrDefault("cherry", 0);  // Default value if key doesn't exist
        System.out.println("Cherry count: " + count);
    }
}
