package CollectionsProgram.HashSet;

import java.util.*;

public class HashSetDuplicateCheck {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog");  // Duplicate

        System.out.println("Animals: " + set);  // "Dog" appears only once
    }
}
