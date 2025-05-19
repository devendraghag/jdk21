package CollectionPrograms;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        // Adding elements
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Green"); // Duplicate, won't be added

        // Iterating safely
        for (String color : set) {
            System.out.println(color);
            if (color.equals("Green")) {
                set.remove("Green"); // Safe to modify during iteration
            }
        }

        System.out.println("After modification: " + set);
    }
}
