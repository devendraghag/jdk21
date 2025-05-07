package FinalKeywords;

class FinalParameterExample4 {
    void show(final int num) {
        // num = 10; // ❌ Error
        System.out.println("Value is: " + num);
    }

    public static void main(String[] args) {
        FinalParameterExample4 obj = new FinalParameterExample4();
        obj.show(5);
    }
}
