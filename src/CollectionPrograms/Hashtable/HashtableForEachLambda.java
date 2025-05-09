package CollectionPrograms.Hashtable;

import java.util.*;

public class HashtableForEachLambda {
    public static void main(String[] args) {
        Hashtable<Integer, String> employees = new Hashtable<>();
        employees.put(101, "John");
        employees.put(102, "Alice");
        employees.put(103, "Bob");

        employees.forEach((id, name) -> System.out.println("Employee ID: " + id + ", Name: " + name));
    }
}
