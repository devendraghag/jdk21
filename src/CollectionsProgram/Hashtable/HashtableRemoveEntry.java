package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableRemoveEntry {
    public static void main(String[] args) {
        Hashtable<String, Integer> phoneBook = new Hashtable<>();
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 11223);

        phoneBook.remove("Bob");

        System.out.println("Updated Phone Book: " + phoneBook);
    }
}
