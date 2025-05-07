package FinalKeywords;

final class FinalClassExample3 {
    void display() {
        System.out.println("This is a final class");
    }
}

// class SubClassExample3 extends FinalClassExample3 {} // ❌ Error

public class TestFinalClassExample3 {
    public static void main(String[] args) {
        FinalClassExample3 obj = new FinalClassExample3();
        obj.display();
    }
}
