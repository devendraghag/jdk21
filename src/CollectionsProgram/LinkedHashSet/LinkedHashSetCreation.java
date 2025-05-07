package CollectionsProgram.LinkedHashSet;

import java.util.*;

public class LinkedHashSetCreation {
    public static void main(String[] args) {
        LinkedHashSet<String> brands = new LinkedHashSet<>();
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Puma");

        System.out.println("Brands: " + brands);
    }
}
