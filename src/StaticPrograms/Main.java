package StaticPrograms;

class OuterClass {
    static int staticVar = 100;

    static class NestedClass {
        void display() {
            System.out.println("Static variable in outer class: " + staticVar);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
        nestedObj.display(); // Output: Static variable in outer class: 100
    }
}
