package CollectionPrograms.EnumMap;

import java.util.*;

enum Car { TOYOTA, HONDA, FORD }

public class EnumMapEntrySetIteration {
    public static void main(String[] args) {
        EnumMap<Car, String> carModels = new EnumMap<>(Car.class);
        carModels.put(Car.TOYOTA, "Camry");
        carModels.put(Car.HONDA, "Civic");
        carModels.put(Car.FORD, "Mustang");

        // Iterating using entrySet()
        for (Map.Entry<Car, String> entry : carModels.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
