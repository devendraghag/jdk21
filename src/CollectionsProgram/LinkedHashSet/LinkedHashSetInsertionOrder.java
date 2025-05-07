package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetInsertionOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");

        System.out.println("Cities (insertion order): " + cities);
    }
}
