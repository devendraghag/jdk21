package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapEntrySetIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 20);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
