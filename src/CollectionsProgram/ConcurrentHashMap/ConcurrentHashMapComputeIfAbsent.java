package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapComputeIfAbsent {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> scoreMap = new ConcurrentHashMap<>();
        scoreMap.put("Alice", 85);
        scoreMap.put("Bob", 90);

        // If the key doesn't exist, compute a new value
        scoreMap.computeIfAbsent("John", k -> 75);

        System.out.println("Score Map: " + scoreMap);
    }
}
