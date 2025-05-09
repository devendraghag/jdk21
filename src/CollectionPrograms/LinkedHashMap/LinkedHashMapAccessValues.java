package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapAccessValues {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("Italy", "Rome");

        String capital = capitals.get("France");
        System.out.println("Capital of France: " + capital);
    }
}
