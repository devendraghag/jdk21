package CollectionsProgram.ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentHashMapEntrySetIteration {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();
        inventory.put("Shampoo", 50);
        inventory.put("Soap", 30);
        inventory.put("Toothpaste", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
