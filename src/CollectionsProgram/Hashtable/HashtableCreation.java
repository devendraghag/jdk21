package CollectionsProgram.Hashtable;

import java.util.*;

public class HashtableCreation {
    public static void main(String[] args) {
        Hashtable<Integer, String> studentNames = new Hashtable<>();
        studentNames.put(101, "John");
        studentNames.put(102, "Alice");
        studentNames.put(103, "Bob");

        System.out.println("Student Names: " + studentNames);
    }
}
