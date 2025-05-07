package CollectionsProgram.TreeSet;

import java.util.*;

public class TreeSetCreation {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Zara");
        names.add("Mike");
        names.add("Adam");

        System.out.println("Sorted Names: " + names);
    }
}
