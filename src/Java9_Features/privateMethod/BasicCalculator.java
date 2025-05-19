package Java9_Features.privateMethod;

interface Calculator {

    default void add(int a, int b) {
        displayResult(a + b);
    }

    default void subtract(int a, int b) {
        displayResult(a - b);
    }

    private void displayResult(int result) {
        System.out.println("Result: " + result);
    }
}

public class BasicCalculator implements Calculator {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        calc.add(10, 5);
        calc.subtract(10, 5);
    }
}
