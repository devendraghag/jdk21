package CollectionPrograms.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(List.of("Java", "Python", "C++"));
        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }
    }
}
