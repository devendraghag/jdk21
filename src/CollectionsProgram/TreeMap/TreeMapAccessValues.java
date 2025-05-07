package CollectionsProgram.TreeMap;

import java.util.*;

public class TreeMapAccessValues {
    public static void main(String[] args) {
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");

        String capital = capitals.get("India");
        System.out.println("Capital of India: " + capital);
    }
}
