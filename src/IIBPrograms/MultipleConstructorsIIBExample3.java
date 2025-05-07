package IIBPrograms;

class MultipleConstructorsIIBExample3 {
    int value;

    {
        value = 10;
        System.out.println("IIB: value set to " + value);
    }

    MultipleConstructorsIIBExample3() {
        System.out.println("Constructor 1");
    }

    MultipleConstructorsIIBExample3(String msg) {
        System.out.println("Constructor 2: " + msg);
    }

    public static void main(String[] args) {
        new MultipleConstructorsIIBExample3();
        new MultipleConstructorsIIBExample3("Hello");
    }
}
