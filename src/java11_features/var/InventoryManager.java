package java11_features.var;

import java.util.HashMap;

public class InventoryManager {
    public static void main(String[] args) {
        var inventory = new HashMap<String, Integer>();  // inferred as HashMap<String, Integer>

        inventory.put("Laptop", 5);
        inventory.put("Tablet", 3);
    }
}
