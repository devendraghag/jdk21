package CollectionPrograms.LinkedHashSet;

import java.util.*;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return id == p.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class LinkedHashSetCustomObjects {
    public static void main(String[] args) {
        LinkedHashSet<Product> products = new LinkedHashSet<>();
        products.add(new Product(101, "Laptop"));
        products.add(new Product(102, "Mobile"));
        products.add(new Product(101, "Laptop")); // Duplicate based on ID

        System.out.println("Product List: " + products);
    }
}
