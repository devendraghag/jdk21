package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapRemoveIfPresent {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> capitals = new ConcurrentHashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");

        // Remove key-value if the key is present and the value matches
        capitals.remove("USA", "Washington, D.C.");

        System.out.println("Capitals after removal: " + capitals);
    }
}
