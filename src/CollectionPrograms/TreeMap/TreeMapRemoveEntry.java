package CollectionPrograms.TreeMap;

import java.util.*;

public class TreeMapRemoveEntry {
    public static void main(String[] args) {
        TreeMap<String, Integer> phoneBook = new TreeMap<>();
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 11223);

        phoneBook.remove("Bob");

        System.out.println("Updated Phone Book: " + phoneBook);
    }
}
