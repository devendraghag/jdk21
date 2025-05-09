package CollectionPrograms.EnumMap;

import java.util.*;

enum Category { ELECTRONICS, CLOTHING, GROCERY }

public class EnumMapReplaceValues {
    public static void main(String[] args) {
        EnumMap<Category, Integer> productPrices = new EnumMap<>(Category.class);
        productPrices.put(Category.ELECTRONICS, 500);
        productPrices.put(Category.CLOTHING, 100);
        productPrices.put(Category.GROCERY, 50);

        // Replacing value of CLOTHING category
        productPrices.replace(Category.CLOTHING, 120);

        System.out.println("Updated Product Prices: " + productPrices);
    }
}
