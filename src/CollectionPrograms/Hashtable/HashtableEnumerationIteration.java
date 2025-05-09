package CollectionPrograms.Hashtable;

import java.util.*;

public class HashtableEnumerationIteration {
    public static void main(String[] args) {
        Hashtable<String, String> countryCapitals = new Hashtable<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");

        Enumeration<String> keys = countryCapitals.keys();
        Enumeration<String> values = countryCapitals.elements();

        while (keys.hasMoreElements() && values.hasMoreElements()) {
            System.out.println("Country: " + keys.nextElement() + " - Capital: " + values.nextElement());
        }
    }
}
