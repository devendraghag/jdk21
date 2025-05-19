package Java9_Features.unmodifiableCollection;

import java.util.*;

public class CopyProtector {
    public static void main(String[] args) {
        List<String> mutable = new ArrayList<>();
        mutable.add("Sun");
        mutable.add("Moon");

        List<String> immutable = List.copyOf(mutable);
        System.out.println(immutable);

        // immutable.add("Star"); // ❌ Throws UnsupportedOperationException
    }
}
