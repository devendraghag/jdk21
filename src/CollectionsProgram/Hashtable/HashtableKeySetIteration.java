package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableKeySetIteration {
    public static void main(String[] args) {
        Hashtable<String, Integer> inventory = new Hashtable<>();
        inventory.put("Shampoo", 50);
        inventory.put("Soap", 30);
        inventory.put("Toothpaste", 20);

        for (String product : inventory.keySet()) {
            System.out.println(product + ": " + inventory.get(product));
        }
    }
}
