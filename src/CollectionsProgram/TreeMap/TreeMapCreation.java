package CollectionsProgram.TreeMap;

import java.util.*;

public class TreeMapCreation {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeNames = new TreeMap<>();
        employeeNames.put(101, "John");
        employeeNames.put(102, "Alice");
        employeeNames.put(103, "Bob");

        System.out.println("Employee Names: " + employeeNames);
    }
}
