package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetCheckRemove {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>(Set.of("London", "Paris", "Tokyo"));
        System.out.println("Contains Tokyo? " + cities.contains("Tokyo"));

        cities.remove("Paris");
        System.out.println("After removal: " + cities);
    }
}
