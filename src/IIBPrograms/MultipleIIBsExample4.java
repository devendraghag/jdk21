package IIBPrograms;

class MultipleIIBsExample4 {
    {
        System.out.println("IIB Block 1");
    }

    {
        System.out.println("IIB Block 2");
    }

    MultipleIIBsExample4() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new MultipleIIBsExample4();
    }
}
