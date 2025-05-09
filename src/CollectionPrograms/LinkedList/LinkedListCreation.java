package CollectionPrograms.LinkedList;

import java.util.*;

public class LinkedListCreation {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names);
    }
}
