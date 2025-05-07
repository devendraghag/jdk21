package FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(4, 6));
    }
}
