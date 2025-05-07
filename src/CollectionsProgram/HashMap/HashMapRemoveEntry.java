package CollectionsProgram.HashMap;

import java.util.*;

public class HashMapRemoveEntry {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 11223);

        phoneBook.remove("Bob");

        System.out.println("Updated Phone Book: " + phoneBook);
    }
}
