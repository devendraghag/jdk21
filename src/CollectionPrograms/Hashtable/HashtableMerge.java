package CollectionPrograms.Hashtable;

import java.util.*;

public class HashtableMerge {
    public static void main(String[] args) {
        Hashtable<String, String> countryCapitals1 = new Hashtable<>();
        countryCapitals1.put("USA", "Washington, D.C.");
        countryCapitals1.put("India", "New Delhi");

        Hashtable<String, String> countryCapitals2 = new Hashtable<>();
        countryCapitals2.put("Japan", "Tokyo");
        countryCapitals2.put("Germany", "Berlin");

        countryCapitals1.putAll(countryCapitals2);

        System.out.println("Merged Hashtable: " + countryCapitals1);
    }
}
