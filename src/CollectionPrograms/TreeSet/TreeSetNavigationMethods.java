package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetNavigationMethods {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>(Set.of(10, 20, 30, 40, 50));

        System.out.println("First: " + nums.first());
        System.out.println("Last: " + nums.last());
        System.out.println("Higher than 30: " + nums.higher(30));
        System.out.println("Lower than 30: " + nums.lower(30));
    }
}
