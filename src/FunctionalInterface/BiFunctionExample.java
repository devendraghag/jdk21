package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> sumDescription = (a, b) -> "Sum is " + (a + b);
        System.out.println(sumDescription.apply(10, 20));
    }
}
