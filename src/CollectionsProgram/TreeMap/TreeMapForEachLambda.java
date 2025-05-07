package CollectionsProgram.TreeMap;

import java.util.*;

public class TreeMapForEachLambda {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "Bob");

        students.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
