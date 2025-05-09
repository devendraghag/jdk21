package CollectionPrograms.ArrayList;

import java.util.*;
import java.util.stream.*;

public class StreamArraySetConversion {
    public static void main(String[] args) {
        // Array to Set using Streams
        String[] array = {"A", "B", "A"};
        Set<String> set = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println("Array to Set: " + set);

        // Set to Array using Streams
        Set<String> sampleSet = Set.of("X", "Y", "Z");
        String[] arrayFromSet = sampleSet.stream().toArray(String[]::new);
        System.out.println("Set to Array: " + Arrays.toString(arrayFromSet));
    }
}
