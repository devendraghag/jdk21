package CollectionPrograms.ArrayList;

import java.util.*;
import java.util.stream.*;

public class StreamArrayListConversion {
    public static void main(String[] args) {
        // Array to List using Streams
        String[] array = {"A", "B", "C"};
        List<String> list = Arrays.stream(array).collect(Collectors.toList());
        System.out.println("Array to List: " + list);

        // List to Array (simple)
        List<String> baseList = Arrays.asList("X", "Y", "Z");
        String[] arrayFromList = baseList.toArray(new String[0]);
        System.out.println("List to Array: " + Arrays.toString(arrayFromList));

        // List to Array with transformation
        String[] upperArray = baseList.stream()
                                      .map(String::toUpperCase)
                                      .toArray(String[]::new);
        System.out.println("Transformed List to Array: " + Arrays.toString(upperArray));
    }
}
