package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapAccessValues {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");

        String capital = capitals.get("India");
        System.out.println("Capital of India: " + capital);
    }
}
