package CollectionPrograms.TreeMap;

import java.util.*;

public class TreeMapNavigableMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(50, "John");
        scores.put(85, "Alice");
        scores.put(30, "Bob");

        System.out.println("HeadMap (less than 60): " + scores.headMap(60));
        System.out.println("TailMap (greater than or equal to 60): " + scores.tailMap(60));
        System.out.println("SubMap (30 to 85): " + scores.subMap(30, 85));
    }
}
