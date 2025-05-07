package IIBPrograms;

class BasicIIBExample1 {
    {
        System.out.println("Instance Initializer Block is executed.");
    }

    BasicIIBExample1() {
        System.out.println("Constructor is called.");
    }

    public static void main(String[] args) {
        BasicIIBExample1 obj = new BasicIIBExample1();
    }
}