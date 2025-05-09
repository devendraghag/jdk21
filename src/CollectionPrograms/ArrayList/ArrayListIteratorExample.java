package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println("Name: " + it.next());
        }
    }
}
