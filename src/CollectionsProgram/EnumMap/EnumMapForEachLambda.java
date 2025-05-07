package CollectionsProgram.EnumMap;

import java.util.*;

enum Fruit { APPLE, BANANA, CHERRY }

public class EnumMapForEachLambda {
    public static void main(String[] args) {
        EnumMap<Fruit, Integer> fruitPrices = new EnumMap<>(Fruit.class);
        fruitPrices.put(Fruit.APPLE, 100);
        fruitPrices.put(Fruit.BANANA, 30);
        fruitPrices.put(Fruit.CHERRY, 150);

        // Iterating using forEach and lambda
        fruitPrices.forEach((fruit, price) -> System.out.println(fruit + ": " + price + " cents"));
    }
}
