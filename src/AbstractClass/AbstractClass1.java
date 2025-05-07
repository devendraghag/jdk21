package AbstractClass;

abstract class Animal {
    public String name; // Public access modifier
    private int age;     // Private access modifier

    // Final method - cannot be overridden in subclasses
    public final void eat() {
        System.out.println("This animal is eating.");
    }

    // Abstract method - must be implemented by subclasses
    public abstract void sound();

    // Static method - can be called without an instance
    public static void info() {
        System.out.println("Animals are living beings.");
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Bark");
    }

    public void setAge(int age) {
    //    this.age = age;  // Accessing private variable via a method
    }

    public int getAge() {
    //    return age;  // Accessing private variable via a method
        return 0;
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.setAge(5);

        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog age: " + dog.getAge());
        dog.sound();  // Output: Bark
        dog.eat();    // Output: This animal is eating.
        Animal.info(); // Output: Animals are living beings.
    }
}