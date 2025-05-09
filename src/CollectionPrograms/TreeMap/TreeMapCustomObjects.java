package CollectionPrograms.TreeMap;

import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public String toString() {
        return name + " (Roll No: " + rollNo + ")";
    }
}

public class TreeMapCustomObjects {
    public static void main(String[] args) {
        TreeMap<Student, Double> studentGrades = new TreeMap<>(Comparator.comparingInt(s -> s.rollNo));
        studentGrades.put(new Student(102, "Alice"), 89.5);
        studentGrades.put(new Student(101, "Bob"), 75.0);

        for (Map.Entry<Student, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " - Grade: " + entry.getValue());
        }
    }
}
