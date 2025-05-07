package CollectionsProgram.HashMap;

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

public class HashMapCustomObjects {
    public static void main(String[] args) {
        HashMap<Product, Double> productPrices = new HashMap<>();
        productPrices.put(new Product(101, "Laptop"), 1200.50);
        productPrices.put(new Product(102, "Phone"), 800.99);

        for (Map.Entry<Product, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs: " + entry.getValue());
        }
    }
}
