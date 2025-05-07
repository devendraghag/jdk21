package CollectionsProgram.HashSet;

import java.util.*;

public class HashSetIteratorExample {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>(Set.of("India", "USA", "Germany"));
        Iterator<String> it = countries.iterator();

        while (it.hasNext()) {
            System.out.println("Country: " + it.next());
        }
    }
}
