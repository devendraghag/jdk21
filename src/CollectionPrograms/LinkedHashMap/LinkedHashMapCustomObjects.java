package CollectionPrograms.LinkedHashMap;

import java.util.*;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return title + " (ID: " + id + ")";
    }
}

public class LinkedHashMapCustomObjects {
    public static void main(String[] args) {
        LinkedHashMap<Book, Double> bookPrices = new LinkedHashMap<>();
        bookPrices.put(new Book(101, "The Great Gatsby"), 15.99);
        bookPrices.put(new Book(102, "Moby Dick"), 12.49);

        for (Map.Entry<Book, Double> entry : bookPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs: " + entry.getValue());
        }
    }
}
