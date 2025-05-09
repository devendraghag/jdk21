package CollectionPrograms.LinkedHashMap;

import java.util.*;

public class LinkedHashMapCreation {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> employeeNames = new LinkedHashMap<>();
        employeeNames.put(101, "John");
        employeeNames.put(102, "Alice");
        employeeNames.put(103, "Bob");

        System.out.println("Employee Names: " + employeeNames);
    }
}
