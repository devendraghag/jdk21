package CollectionPrograms.ArrayList;

import java.util.*;
import java.util.stream.*;

public class StreamArrayMapConversion {
    public static void main(String[] args) {
        // Array of key-value pairs to Map using Streams
        String[][] kvPairs = { {"A", "Apple"}, {"B", "Banana"} };
        Map<String, String> map = Arrays.stream(kvPairs)
            .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
        System.out.println("Array to Map: " + map);

        // Map to Arrays using Streams
        Map<String, String> sampleMap = Map.of("X", "Xylophone", "Y", "Yogurt");

        String[] keys = sampleMap.keySet().stream().toArray(String[]::new);
        String[] values = sampleMap.values().stream().toArray(String[]::new);
        Map.Entry<String, String>[] entries = sampleMap.entrySet().stream().toArray(Map.Entry[]::new);

        System.out.println("Map Keys: " + Arrays.toString(keys));
        System.out.println("Map Values: " + Arrays.toString(values));
        System.out.println("Map Entries: " + Arrays.toString(entries));
    }
}
