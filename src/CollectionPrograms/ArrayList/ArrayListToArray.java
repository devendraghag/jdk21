package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue"));
        String[] colorArray = colors.toArray(new String[0]);

        System.out.println("Array Elements:");
        for (String color : colorArray) {
            System.out.println(color);
        }
    }
}
