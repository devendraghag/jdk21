package SuperKeywords;

class ParentExample5 {
    ParentExample5(String msg) {
        System.out.println("Parent constructor: " + msg);
    }
}

class ChildParamConstructorExample5 extends ParentExample5 {
    ChildParamConstructorExample5() {
        super("Called from Child");  // Calls parameterized constructor of parent
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        ChildParamConstructorExample5 obj = new ChildParamConstructorExample5();
    }
}
