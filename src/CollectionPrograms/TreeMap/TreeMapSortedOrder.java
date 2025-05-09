package CollectionPrograms.TreeMap;

import java.util.*;

public class TreeMapSortedOrder {
    public static void main(String[] args) {
        TreeMap<Integer, String> cities = new TreeMap<>();
        cities.put(10, "London");
        cities.put(5, "New York");
        cities.put(20, "Tokyo");

        System.out.println("Cities (Sorted by Keys): " + cities);
    }
}
