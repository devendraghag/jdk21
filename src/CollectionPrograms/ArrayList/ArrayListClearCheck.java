package CollectionPrograms.ArrayList;

import java.util.*;

public class ArrayListClearCheck {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>(List.of("Book1", "Book2"));
        books.clear();
        System.out.println("Is book list empty? " + books.isEmpty());
    }
}
