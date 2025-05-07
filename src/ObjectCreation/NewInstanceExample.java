package ObjectCreation;

class NewInstanceExample {
    String message = "Object created using Class.newInstance()";

    void display() {
        System.out.println(message);
    }
}

class NewInstanceTest {
    public static void main(String[] args) throws Exception {
        NewInstanceExample obj = NewInstanceExample.class.newInstance();
        obj.display();
    }
}
