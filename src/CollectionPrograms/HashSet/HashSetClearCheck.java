package CollectionPrograms.HashSet;

import java.util.*;

public class HashSetClearCheck {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(Set.of("Red", "Green", "Blue"));
        colors.clear();

        System.out.println("Is set empty? " + colors.isEmpty());
    }
}
//LinkedHashSet<E> give me all important programs related to this class including iteration different ways. please give unique and revelant class names