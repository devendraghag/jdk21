package CollectionPrograms.LinkedHashSet;

import java.util.*;

public class LinkedHashSetClearCheck {
    public static void main(String[] args) {
        LinkedHashSet<String> foods = new LinkedHashSet<>(Set.of("Pizza", "Burger", "Pasta"));
        foods.clear();

        System.out.println("Is set empty? " + foods.isEmpty());
    }
}
