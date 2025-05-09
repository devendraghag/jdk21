package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayListConversion {
    public static void main(String[] args) {
        // Array to List (fixed-size)
        String[] array = {"A", "B", "C"};
        List<String> fixedList = Arrays.asList(array);
        System.out.println("Fixed-size List: " + fixedList);

        // Array to List (modifiable)
        List<String> modifiableList = new ArrayList<>(Arrays.asList(array));
        modifiableList.add("D");
        System.out.println("Modifiable List: " + modifiableList);

        // List to Array
        List<String> list = Arrays.asList("X", "Y", "Z");
        String[] newArray = list.toArray(new String[0]);
        System.out.println("List to Array: " + Arrays.toString(newArray));
    }
}
