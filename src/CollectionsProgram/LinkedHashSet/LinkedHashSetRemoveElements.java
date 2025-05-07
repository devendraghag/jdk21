package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetRemoveElements {
    public static void main(String[] args) {
        LinkedHashSet<String> tools = new LinkedHashSet<>(Set.of("Hammer", "Drill", "Wrench"));
        tools.remove("Drill");

        System.out.println("After removal: " + tools);
    }
}
