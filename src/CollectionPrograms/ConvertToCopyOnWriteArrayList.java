package CollectionPrograms;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConvertToCopyOnWriteArrayList {
    public static void main(String[] args) {
        List<String> normalList = Arrays.asList("A", "B", "C");

        // Convert using constructor
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>(normalList);

        System.out.println("CopyOnWriteArrayList: " + cowList);
    }
}
