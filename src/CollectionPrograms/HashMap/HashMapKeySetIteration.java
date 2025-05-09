package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapKeySetIteration {
    public static void main(String[] args) {
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Laptop", 1200.50);
        prices.put("Phone", 800.99);
        prices.put("Tablet", 450.75);

        for (String product : prices.keySet()) {
            System.out.println(product + " costs: " + prices.get(product));
        }
    }
}
