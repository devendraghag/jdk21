package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapEntrySetIteration {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();
        inventory.put("Shampoo", 50);
        inventory.put("Soap", 30);
        inventory.put("Toothpaste", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
