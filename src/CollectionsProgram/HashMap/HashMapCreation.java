package CollectionsProgram.HashMap;

import java.util.*;

public class HashMapCreation {
    public static void main(String[] args) {
        HashMap<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(1, "A");
        studentGrades.put(2, "B");
        studentGrades.put(3, "A");

        System.out.println("Student Grades: " + studentGrades);
    }
}
