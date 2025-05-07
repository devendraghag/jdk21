package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name = "John";
    public int age = 25;

    public Person() {
        // Default constructor
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Load the class dynamically
            Class<?> personClass = Class.forName("Person");

            // Step 2: Create a new instance using default constructor
            Constructor<?> constructor = personClass.getDeclaredConstructor();
            Object personObject = constructor.newInstance();

            // Step 3: Access and print the public field (age)
            Field ageField = personClass.getField("age");
            System.out.println("Original Age: " + ageField.get(personObject));

            // Modify the public field
            ageField.set(personObject, 30);
            System.out.println("Modified Age: " + ageField.get(personObject));

            // Step 4: Access and print the private field (name)
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // make private field accessible
            System.out.println("Original Name: " + nameField.get(personObject));

            // Modify the private field
            nameField.set(personObject, "Alice");
            System.out.println("Modified Name: " + nameField.get(personObject));

            // Step 5: Invoke a public method
            Method sayHelloMethod = personClass.getMethod("sayHello");
            sayHelloMethod.invoke(personObject); // Output: Hello! My name is Alice and I am 30 years old.

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//        | Step | Action                             | Purpose                                     |
//        | ---- | ---------------------------------- | ------------------------------------------- |
//        | 1    | Load `Person` class                | Dynamically loads class by name             |
//        | 2    | Instantiate using reflection       | Calls default constructor                   |
//        | 3    | Access/modify public field `age`   | Gets and sets a public field                |
//        | 4    | Access/modify private field `name` | Makes private field accessible, modifies it |
//        | 5    | Call `sayHello()` method           | Invokes a public method using reflection    |

