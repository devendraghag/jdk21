package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetNoDuplicates {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);  // Duplicate

        System.out.println("Numbers: " + numbers);
    }
}
