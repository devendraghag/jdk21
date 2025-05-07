package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableAccessValues {
    public static void main(String[] args) {
        Hashtable<String, Integer> population = new Hashtable<>();
        population.put("China", 1444216107);
        population.put("India", 1380004385);
        population.put("USA", 331002651);

        Integer populationOfIndia = population.get("India");
        System.out.println("Population of India: " + populationOfIndia);
    }
}
