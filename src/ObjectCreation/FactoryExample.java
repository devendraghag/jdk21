package ObjectCreation;

class FactoryExample {
    String message;

    private FactoryExample() {
        message = "Object created using Factory Method";
    }

    public static FactoryExample createInstance() {
        return new FactoryExample();
    }

    void display() {
        System.out.println(message);
    }
}

class FactoryTest {
    public static void main(String[] args) {
        FactoryExample obj = FactoryExample.createInstance();
        obj.display();
    }
}
