package CollectionPrograms.HashSet;

import java.util.*;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> tools = new HashSet<>(Set.of("Hammer", "Wrench", "Screwdriver"));
        String[] toolArray = tools.toArray(new String[0]);

        System.out.println("Array Elements:");
        for (String tool : toolArray) {
            System.out.println(tool);
        }
    }
}
