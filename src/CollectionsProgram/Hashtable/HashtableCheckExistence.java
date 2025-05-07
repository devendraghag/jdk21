package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableCheckExistence {
    public static void main(String[] args) {
        Hashtable<String, String> capitals = new Hashtable<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");

        System.out.println("Contains key 'India'? " + capitals.containsKey("India"));
        System.out.println("Contains value 'Washington, D.C.'? " + capitals.containsValue("Washington, D.C."));
    }
}
