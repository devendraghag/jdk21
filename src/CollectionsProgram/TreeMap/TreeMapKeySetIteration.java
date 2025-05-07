package CollectionsProgram.TreeMap;

import java.util.*;

public class TreeMapKeySetIteration {
    public static void main(String[] args) {
        TreeMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 1200.50);
        productPrices.put("Phone", 800.99);
        productPrices.put("Tablet", 450.75);

        for (String product : productPrices.keySet()) {
            System.out.println(product + " costs: " + productPrices.get(product));
        }
    }
}
