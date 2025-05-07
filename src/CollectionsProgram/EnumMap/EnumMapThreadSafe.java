package CollectionsProgram.EnumMap;

import java.util.*;

enum Employee1 { JAMES, EMMA, DAVID }

public class EnumMapThreadSafe {
    public static void main(String[] args) {
        EnumMap<Employee1, Integer> salaries = new EnumMap<>(Employee1.class);
        salaries.put(Employee1.JAMES, 50000);
        salaries.put(Employee1.EMMA, 60000);
        salaries.put(Employee1.DAVID, 55000);

        // Synchronizing to simulate thread-safe operations
        synchronized (salaries) {
            for (Map.Entry<Employee1, Integer> entry : salaries.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
