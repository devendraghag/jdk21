package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetToArray {
    public static void main(String[] args) {
        LinkedHashSet<String> browsers = new LinkedHashSet<>(Set.of("Chrome", "Firefox", "Edge"));
        String[] array = browsers.toArray(new String[0]);

        System.out.println("Browser Array:");
        for (String browser : array) {
            System.out.println(browser);
        }
    }
}
