package SuperKeywords;

class ParentExample2 {
    void show() {
        System.out.println("Parent show() method");
    }
}

class ChildInvokeMethodExample2 extends ParentExample2 {
    void show() {
        System.out.println("Child show() method");
    }

    void display() {
        super.show();  // Call parent class method
    }

    public static void main(String[] args) {
        ChildInvokeMethodExample2 obj = new ChildInvokeMethodExample2();
        obj.display();
    }
}
