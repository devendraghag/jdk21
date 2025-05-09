package SimplePrograms;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Creating BigInteger objects
        BigInteger num1 = new BigInteger("123456789123456789123456789");
        BigInteger num2 = new BigInteger("987654321987654321987654321");

        // Addition
        BigInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigInteger difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigInteger product = num1.multiply(num2);
        System.out.println("Product: " + product);

        // Division
        BigInteger quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient);

        // Modulus
        BigInteger modulus = num1.mod(num2);
        System.out.println("Modulus: " + modulus);

        // Finding GCD
        BigInteger gcd = num1.gcd(num2);
        System.out.println("GCD: " + gcd);

        // Checking if a number is prime
        boolean isPrime = num1.isProbablePrime(1);
        System.out.println("Is num1 prime? " + isPrime);
    }
}
