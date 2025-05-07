package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetIteratorExample {
    public static void main(String[] args) {
        LinkedHashSet<String> gadgets = new LinkedHashSet<>(Set.of("Phone", "Tablet", "Laptop"));
        Iterator<String> iterator = gadgets.iterator();
        while (iterator.hasNext()) {
            System.out.println("Gadget: " + iterator.next());
        }
    }
}
