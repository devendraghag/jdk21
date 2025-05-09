package CollectionPrograms.EnumMap;

import java.util.*;

enum Department { HR, IT, SALES }

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old";
    }
}

public class EnumMapComplexValues {
    public static void main(String[] args) {
        EnumMap<Department, Employee> departmentEmployees = new EnumMap<>(Department.class);
        departmentEmployees.put(Department.HR, new Employee("Alice", 30));
        departmentEmployees.put(Department.IT, new Employee("Bob", 25));
        departmentEmployees.put(Department.SALES, new Employee("Charlie", 35));

        // Iterating through complex object values
        for (Map.Entry<Department, Employee> entry : departmentEmployees.entrySet()) {
            System.out.println(entry.getKey() + " Department - " + entry.getValue());
        }
    }
}
