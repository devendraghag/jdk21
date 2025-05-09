package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapMerge {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Name", "John");
        map1.put("Age", "25");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("City", "New York");
        map2.put("Country", "USA");

        map1.putAll(map2);

        System.out.println("Merged HashMap: " + map1);
    }
}
