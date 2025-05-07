package CollectionsProgram.TreeSet;

import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.roll - s.roll;  // Sort by roll number
    }

    public String toString() {
        return name + " (Roll: " + roll + ")";
    }
}

public class TreeSetCustomObjects {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(102, "Alice"));
        students.add(new Student(101, "Bob"));
        students.add(new Student(103, "Charlie"));

        System.out.println("Students (sorted by roll): " + students);
    }
}
