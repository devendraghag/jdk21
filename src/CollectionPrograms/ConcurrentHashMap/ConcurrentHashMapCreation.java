package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapCreation {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> employeeNames = new ConcurrentHashMap<>();
        employeeNames.put(101, "John");
        employeeNames.put(102, "Alice");
        employeeNames.put(103, "Bob");

        System.out.println("Employee Names: " + employeeNames);
    }
}
