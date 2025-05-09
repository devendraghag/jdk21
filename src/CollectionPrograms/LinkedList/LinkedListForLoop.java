package CollectionPrograms.LinkedList;

import java.util.*;

public class LinkedListForLoop {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>(List.of("Pen", "Pencil", "Eraser"));
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item at " + i + ": " + items.get(i));
        }
    }
}
