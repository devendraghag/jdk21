package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetForEachLoop {
    public static void main(String[] args) {
        LinkedHashSet<String> vehicles = new LinkedHashSet<>(Set.of("Car", "Bike", "Bus"));
        for (String vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle);
        }
    }
}
