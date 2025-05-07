package CollectionsProgram.LinkedHashMap;

import java.util.*;

public class LinkedHashMapMerge {
    public static void main(String[] args) {
        LinkedHashMap<String, String> countryCapitals = new LinkedHashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");

        LinkedHashMap<String, String> additionalCapitals = new LinkedHashMap<>();
        additionalCapitals.put("Japan", "Tokyo");
        additionalCapitals.put("UK", "London");

        countryCapitals.putAll(additionalCapitals);

        System.out.println("Merged LinkedHashMap: " + countryCapitals);
    }
}
