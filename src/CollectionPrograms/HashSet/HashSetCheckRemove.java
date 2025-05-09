package CollectionPrograms.HashSet;

import java.util.*;

public class HashSetCheckRemove {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4));

        System.out.println("Contains 2? " + numbers.contains(2));
        numbers.remove(3);
        System.out.println("After removing 3: " + numbers);
    }
}
