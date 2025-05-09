package CollectionPrograms.TreeMap;

import java.util.*;

public class TreeMapCustomComparator {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>(Comparator.reverseOrder());
        scores.put(50, "John");
        scores.put(85, "Alice");
        scores.put(30, "Bob");

        System.out.println("Scores in Reverse Order: " + scores);
    }
}
