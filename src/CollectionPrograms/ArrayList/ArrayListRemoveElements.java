package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayListRemoveElements {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(List.of("USA", "UK", "India"));
        countries.remove("UK");
        countries.remove(0); // removes "USA"
        System.out.println("Remaining countries: " + countries);
    }
}
