package ObjectCreation;

class NewKeywordExample {
    String message;

    NewKeywordExample() {
        message = "Object created using new keyword";
    }

    void display() {
        System.out.println(message);
    }
}

class NewKeywordTest {
    public static void main(String[] args) {
        NewKeywordExample obj = new NewKeywordExample();
        obj.display();
    }
}
