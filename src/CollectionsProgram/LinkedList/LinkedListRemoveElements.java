package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListRemoveElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D"));
        list.removeFirst();
        list.removeLast();
        list.remove("B");

        System.out.println("After Removals: " + list);
    }
}
