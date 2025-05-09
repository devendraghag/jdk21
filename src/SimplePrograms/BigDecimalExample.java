package SimplePrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        // Creating BigDecimal objects
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("789.123");

        // Addition
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum); // Sum: 912.579

        // Subtraction
        BigDecimal difference = num1.subtract(num2);
        System.out.println("Difference: " + difference); // Difference: -665.667

        // Multiplication
        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + product); // Product: 97434.122188

        // Division (with rounding)
        BigDecimal quotient = num1.divide(num2, 2, RoundingMode.HALF_UP); // 2 decimal places
        System.out.println("Quotient: " + quotient); // Quotient: 0.16

        // Scaling (set precision)
        BigDecimal scaledValue = num1.setScale(2, RoundingMode.DOWN); // Set scale to 2 decimal places
        System.out.println("Scaled Value: " + scaledValue); // Scaled Value: 123.45
    }
}
