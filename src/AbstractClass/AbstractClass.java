package AbstractClass;

abstract class Animal1 {
    // Abstract method (no body)
    public abstract void sound();

    // Concrete method (with body)
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog1 extends Animal1 {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Bark");
    }
//    public void sleep(){
//        System.out.println("Sleep method from Dog1...");
//    }                  we can override method
}

class Cat1 extends Animal1 {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly
        // Animal a = new Animal(); // Compile-time error

        Dog1 dog = new Dog1();
        dog.sound();  // Output: Bark
        dog.sleep();  // Output: This animal is sleeping.

        Cat1 cat = new Cat1();
        cat.sound();  // Output: Meow
        cat.sleep();  // Output: This animal is sleeping.
    }
}