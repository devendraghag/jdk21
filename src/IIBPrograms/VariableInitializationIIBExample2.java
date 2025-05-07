package IIBPrograms;

class VariableInitializationIIBExample2 {
    int value;

    {
        value = 42;
        System.out.println("IIB: Value initialized to " + value);
    }

    VariableInitializationIIBExample2() {
        System.out.println("Constructor: Value = " + value);
    }

    public static void main(String[] args) {
        new VariableInitializationIIBExample2();
    }
}
