package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapReplaceMethod {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> itemPrices = new ConcurrentHashMap<>();
        itemPrices.put("Laptop", 1200);
        itemPrices.put("Phone", 800);

        // Replace the value of a key if it exists
        itemPrices.replace("Phone", 850);

        System.out.println("Item Prices: " + itemPrices);
    }
}
