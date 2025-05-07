package Serializations;

import java.io.*;

// Class implementing Serializable interface
class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeExample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);

        try {
            // Create an ObjectOutputStream to write the object to a file
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(person); // Serialize the person object
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
