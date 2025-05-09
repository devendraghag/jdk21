package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetIteratorExample {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>(Set.of("India", "USA", "UK"));
        Iterator<String> it = countries.iterator();
        while (it.hasNext()) {
            System.out.println("Country: " + it.next());
        }
    }
}
