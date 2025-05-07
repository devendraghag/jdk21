package CollectionsProgram.TreeSet;

import java.util.*;

public class TreeSetNaturalOrder {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Sorted Numbers: " + numbers);
    }
}
