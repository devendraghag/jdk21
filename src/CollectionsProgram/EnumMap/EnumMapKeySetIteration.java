package CollectionsProgram.EnumMap;

import java.util.*;

enum City { NEW_YORK, LOS_ANGELES, CHICAGO }

public class EnumMapKeySetIteration {
    public static void main(String[] args) {
        EnumMap<City, Integer> population = new EnumMap<>(City.class);
        population.put(City.NEW_YORK, 8419600);
        population.put(City.LOS_ANGELES, 3980400);
        population.put(City.CHICAGO, 2716000);

        // Iterating using keySet
        for (City city : population.keySet()) {
            System.out.println(city + ": " + population.get(city));
        }
    }
}
