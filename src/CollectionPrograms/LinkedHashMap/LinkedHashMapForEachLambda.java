package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapForEachLambda {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "Bob");

        students.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
