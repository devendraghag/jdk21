package InterfacePrograms;

// Define an interface with a default method
interface Greeting {
    void sayHello(); // abstract method

    // default method
    default void sayGoodbye() {
        System.out.println("Goodbye from Greeting interface!");
    }
}

// Implementing class
class Person implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello from Person class!");
    }
}

// Main class
public class DefaultMethod1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();     // calls implemented method
        person.sayGoodbye();   // calls default method from interface
    }
}
