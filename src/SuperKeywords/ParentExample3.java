package SuperKeywords;

class ParentExample3 {
    ParentExample3() {
        System.out.println("Parent constructor called");
    }
}

class ChildConstructorExample3 extends ParentExample3 {
    ChildConstructorExample3() {
        super();  // Must be the first statement
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
        ChildConstructorExample3 obj = new ChildConstructorExample3();
    }
}
