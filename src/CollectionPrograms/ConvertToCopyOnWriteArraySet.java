package CollectionPrograms;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConvertToCopyOnWriteArraySet {
    public static void main(String[] args) {
        Set<String> normalSet = new HashSet<>(Arrays.asList("X", "Y", "Z", "X"));

        // Convert using constructor
        CopyOnWriteArraySet<String> cowSet = new CopyOnWriteArraySet<>(normalSet);

        System.out.println("CopyOnWriteArraySet: " + cowSet);
    }
}

//✅ From any Collection
//Both classes provide constructors that accept any Collection.
//
//Collection<String> data = List.of("One", "Two", "Three");
//CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>(data);
//CopyOnWriteArraySet<String> cowSet = new CopyOnWriteArraySet<>(data);


