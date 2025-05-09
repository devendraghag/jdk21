package CollectionPrograms.HashMap;

import java.util.*;

public class HashMapForEachLambda {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John");
        employees.put(102, "Alice");
        employees.put(103, "Bob");

        employees.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
