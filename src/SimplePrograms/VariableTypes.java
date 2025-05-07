package SimplePrograms;

class VariableTypes {
    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar;

    // Constructor to initialize the instance variable
    public VariableTypes(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Method with local variable
    public void display() {
        // Local variable
        int localVar = 5;
        
        // Accessing local, instance, and static variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Static variable can be accessed directly using class name
        System.out.println("Accessing static variable directly: " + VariableTypes.staticVar);

        // Creating objects of VariableTypes class
        VariableTypes obj1 = new VariableTypes(20);
        VariableTypes obj2 = new VariableTypes(30);

        // Displaying instance and static variable for obj1
        System.out.println("\nFor obj1:");
        obj1.display();

        // Displaying instance and static variable for obj2
        System.out.println("\nFor obj2:");
        obj2.display();

        // Modifying static variable through one object
        obj1.staticVar = 50;

        // Accessing static variable from both objects
        System.out.println("\nAfter modifying static variable via obj1:");
        obj1.display();
        obj2.display();
    }
}
