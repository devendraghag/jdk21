package CollectionsProgram.ArrayList;

import java.util.*;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Mango"));
        Collections.sort(fruits);
        System.out.println("Sorted Fruits: " + fruits);
    }
}
