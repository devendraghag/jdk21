package Serializations;

import java.io.*;

// Class implementing Serializable interface
class Person1 implements Serializable {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DeserializeExample {
    public static void main(String[] args) {
        Person1 person = null;

        try {
            // Create an ObjectInputStream to read the object from the file
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            person = (Person1) in.readObject(); // Deserialize the person object
            in.close();
            fileIn.close();

            System.out.println("Object has been deserialized");
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
