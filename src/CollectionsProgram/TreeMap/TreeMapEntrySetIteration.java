package CollectionsProgram.TreeMap;

import java.util.*;

public class TreeMapEntrySetIteration {
    public static void main(String[] args) {
        TreeMap<String, Integer> inventory = new TreeMap<>();
        inventory.put("Shampoo", 50);
        inventory.put("Soap", 30);
        inventory.put("Toothpaste", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
