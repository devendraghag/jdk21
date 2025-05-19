package CollectionPrograms;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Iterating safely even when modifying
        for (String fruit : list) {
            System.out.println(fruit);
            if (fruit.equals("Banana")) {
                list.remove("Banana"); // Safe to modify during iteration
            }
        }

        System.out.println("After modification: " + list);
    }
}
