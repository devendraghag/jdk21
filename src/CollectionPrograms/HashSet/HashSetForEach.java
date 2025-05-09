package CollectionPrograms.HashSet;

import java.util.*;

public class HashSetForEach {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>(Set.of("Java", "Python", "C++"));
        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }
    }
}
