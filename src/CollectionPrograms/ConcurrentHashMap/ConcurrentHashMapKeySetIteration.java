package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapKeySetIteration {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();
        inventory.put("Shampoo", 50);
        inventory.put("Soap", 30);
        inventory.put("Toothpaste", 20);

        // Iterate using the key set
        for (String product : inventory.keySet()) {
            System.out.println(product + ": " + inventory.get(product));
        }
    }
}
