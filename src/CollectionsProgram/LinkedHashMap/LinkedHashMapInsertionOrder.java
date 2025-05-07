package CollectionsProgram.LinkedHashMap;

import java.util.*;

public class LinkedHashMapInsertionOrder {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> citiesPopulation = new LinkedHashMap<>();
        citiesPopulation.put("London", 9000000);
        citiesPopulation.put("New York", 8000000);
        citiesPopulation.put("Tokyo", 14000000);

        System.out.println("Cities (Insertion Order): " + citiesPopulation);
    }
}
