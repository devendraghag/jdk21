package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapForEachLambda {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> students = new ConcurrentHashMap<>();
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "Bob");

        // Using lambda for iteration
        students.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }
}
