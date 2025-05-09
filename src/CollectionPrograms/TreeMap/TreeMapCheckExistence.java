package CollectionPrograms.TreeMap;

import java.util.*;

public class TreeMapCheckExistence {
    public static void main(String[] args) {
        TreeMap<String, Integer> population = new TreeMap<>();
        population.put("India", 1380004385);
        population.put("China", 1444216107);

        System.out.println("Contains key 'India'? " + population.containsKey("India"));
        System.out.println("Contains value 1444216107? " + population.containsValue(1444216107));
    }
}
