package Java9_Features.unmodifiableCollection;

import java.util.List;

public class NullFailDemo {
    public static void main(String[] args) {
        // List.of("One", null); // ❌ Throws NullPointerException
    }
}
