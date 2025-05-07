package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapRemoveEntry {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> countries = new ConcurrentHashMap<>();
        countries.put("USA", "Washington, D.C.");
        countries.put("India", "New Delhi");
        countries.put("Japan", "Tokyo");

        // Remove if the value matches
        countries.remove("USA", "Washington, D.C.");

        System.out.println("Updated Countries: " + countries);
    }
}
