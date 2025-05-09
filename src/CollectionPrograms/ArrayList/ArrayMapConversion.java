package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayMapConversion {
    public static void main(String[] args) {
        // Array of key-value pairs to Map
        String[][] kvPairs = {{"A", "Apple"}, {"B", "Banana"}};
        Map<String, String> map = new HashMap<>();
        for (String[] pair : kvPairs) {
            map.put(pair[0], pair[1]);
        }
        System.out.println("Array to Map: " + map);

        // Map to Array (keys, values, entries)
        Map<String, String> sampleMap = Map.of("X", "Xylophone", "Y", "Yogurt");

        String[] keys = sampleMap.keySet().toArray(new String[0]);
        String[] values = sampleMap.values().toArray(new String[0]);
        Map.Entry<String, String>[] entries = sampleMap.entrySet().toArray(new Map.Entry[0]);

        System.out.println("Map Keys to Array: " + Arrays.toString(keys));
        System.out.println("Map Values to Array: " + Arrays.toString(values));
        System.out.println("Map Entries to Array: " + Arrays.toString(entries));
    }
}
