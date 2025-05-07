package SuperKeywords;

class ParentExample4 {
    int value = 50;

    void display() {
        System.out.println("Parent display()");
    }
}

class ChildOverrideExample4 extends ParentExample4 {
    int value = 100;

    void display() {
        System.out.println("Child display()");
    }

    void show() {
        super.display();          // Parent method
        System.out.println(super.value); // Parent variable
    }

    public static void main(String[] args) {
        ChildOverrideExample4 obj = new ChildOverrideExample4();
        obj.show();
    }
}
