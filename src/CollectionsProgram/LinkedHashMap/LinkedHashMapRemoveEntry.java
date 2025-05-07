package CollectionsProgram.LinkedHashMap;

import java.util.*;

public class LinkedHashMapRemoveEntry {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 11223);

        phoneBook.remove("Bob");

        System.out.println("Updated Phone Book: " + phoneBook);
    }
}
