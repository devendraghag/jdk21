package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListListIterator {
    public static void main(String[] args) {
        LinkedList<String> flowers = new LinkedList<>(List.of("Rose", "Lily", "Tulip"));
        ListIterator<String> listIterator = flowers.listIterator();

        System.out.println("Forward:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
