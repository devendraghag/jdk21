package CollectionPrograms.EnumMap;

import java.util.*;

enum Vehicle { CAR, BIKE, TRUCK }

public class EnumMapCheckExistence {
    public static void main(String[] args) {
        EnumMap<Vehicle, String> vehicleColors = new EnumMap<>(Vehicle.class);
        vehicleColors.put(Vehicle.CAR, "Red");
        vehicleColors.put(Vehicle.BIKE, "Blue");

        // Check if a key exists
        boolean containsCar = vehicleColors.containsKey(Vehicle.CAR);
        // Check if a value exists
        boolean containsRed = vehicleColors.containsValue("Red");

        System.out.println("Contains CAR: " + containsCar);
        System.out.println("Contains Red color: " + containsRed);
    }
}
