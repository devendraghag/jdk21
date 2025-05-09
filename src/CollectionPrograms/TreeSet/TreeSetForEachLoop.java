package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetForEachLoop {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>(Set.of("Banana", "Apple", "Mango"));
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
