package CollectionPrograms.EnumMap;

import java.util.*;

enum Department1 { HR, IT, SALES }

public class EnumMapMerge {
    public static void main(String[] args) {
        EnumMap<Department1, String> departmentHeads1 = new EnumMap<>(Department1.class);
        departmentHeads1.put(Department1.HR, "Alice");
        departmentHeads1.put(Department1.IT, "Bob");

        EnumMap<Department1, String> departmentHeads2 = new EnumMap<>(Department1.class);
        departmentHeads2.put(Department1.SALES, "Charlie");

        // Merging the two EnumMaps
        departmentHeads1.putAll(departmentHeads2);

        System.out.println("Merged Department Heads: " + departmentHeads1);
    }
}
