package InterfacePrograms;

// Interface with default and private methods
interface Greeter {
    void greet(); // abstract method

    // default method using a private helper method
    default void sayFarewell() {
        System.out.println(getFarewellMessage());
    }

    // private helper method (Java 9+ feature)
    private String getFarewellMessage() {
        return "Goodbye from Greeter interface!";
    }
}

// Implementing class
class FriendlyPerson implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello! Nice to meet you.");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        FriendlyPerson person = new FriendlyPerson();
        person.greet();        // implemented method
        person.sayFarewell();  // default method (uses private method)
    }
}
