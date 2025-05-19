package Java9_Features.unmodifiableCollection;

import java.util.List;

public class MiniListMaker {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");
        System.out.println(fruits);

        // fruits.add("Orange"); // ❌ Throws UnsupportedOperationException
    }
}
