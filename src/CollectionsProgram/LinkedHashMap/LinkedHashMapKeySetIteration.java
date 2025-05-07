package CollectionsProgram.LinkedHashMap;

import java.util.*;

public class LinkedHashMapKeySetIteration {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> productPrices = new LinkedHashMap<>();
        productPrices.put("Laptop", 1200.50);
        productPrices.put("Phone", 800.99);
        productPrices.put("Tablet", 450.75);

        for (String product : productPrices.keySet()) {
            System.out.println(product + " costs: " + productPrices.get(product));
        }
    }
}
