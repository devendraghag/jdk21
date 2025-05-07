package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapMerge {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
        map1.put("apple", 2);
        map1.put("banana", 3);

        ConcurrentHashMap<String, Integer> map2 = new ConcurrentHashMap<>();
        map2.put("apple", 1);
        map2.put("orange", 4);

        // Merge the two maps (merge values for the same keys)
        map1.merge("apple", 5, Integer::sum); // Adds the values of 'apple'

        System.out.println("Merged Map: " + map1);
    }
}
