package CollectionPrograms.HashSet;

import java.util.*;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return name + " (" + id + ")";
    }
}

public class HashSetCustomObjects {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Alice", 1)); // Duplicate based on id

        System.out.println("Students: " + students);
    }
}
