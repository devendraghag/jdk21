package FinalKeywords;

class FinalVariableExample1 {
    final int MAX_SPEED = 120;

    void show() {
        // MAX_SPEED = 150;  // ❌ Error: cannot assign a value to final variable
        System.out.println("Max speed is: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalVariableExample1 obj = new FinalVariableExample1();
        obj.show();
    }
}
