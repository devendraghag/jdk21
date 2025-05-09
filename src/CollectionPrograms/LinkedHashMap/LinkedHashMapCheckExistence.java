package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapCheckExistence {
    public static void main(String[] args) {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("USA", "Washington, D.C.");
        countries.put("India", "New Delhi");

        System.out.println("Contains 'India'? " + countries.containsKey("India"));
        System.out.println("Contains value 'Washington, D.C.'? " + countries.containsValue("Washington, D.C."));
    }
}
