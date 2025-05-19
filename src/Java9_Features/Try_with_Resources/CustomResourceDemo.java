package Java9_Features.Try_with_Resources;

class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("Resource " + name + " opened.");
    }

    public void doSomething() {
        System.out.println("Using resource: " + name);
    }

    @Override
    public void close() {
        System.out.println("Resource " + name + " closed.");
    }
}

public class CustomResourceDemo {
    public static void main(String[] args) {
        MyResource res1 = new MyResource("R1");
        MyResource res2 = new MyResource("R2");

        try (res1; res2) {
            res1.doSomething();
            res2.doSomething();
        }
    }
}
