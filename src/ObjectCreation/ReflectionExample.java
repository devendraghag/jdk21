package ObjectCreation;

class ReflectionExample {
    String message = "Object created using Reflection";

    void display() {
        System.out.println(message);
    }
}

class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        ReflectionExample obj = (ReflectionExample) clazz.getDeclaredConstructor().newInstance();
        obj.display();
    }
}
