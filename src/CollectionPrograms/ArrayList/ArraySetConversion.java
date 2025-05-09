package CollectionPrograms.ArrayList;

import java.util.*;

public class ArraySetConversion {
    public static void main(String[] args) {
        // Array to Set (removes duplicates)
        String[] array = {"A", "B", "A"};
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println("Array to Set (no duplicates): " + set);

        // Set to Array
        Set<String> sampleSet = Set.of("X", "Y", "Z");
        String[] arrayFromSet = sampleSet.toArray(new String[0]);
        System.out.println("Set to Array: " + Arrays.toString(arrayFromSet));
    }
}
