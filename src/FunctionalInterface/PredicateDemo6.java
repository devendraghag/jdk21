package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo6 {
    public static void main(String args[]) {
        checkNumber(1111, n -> n % 2 == 0);
    }

    public static void checkNumber(int num, Predicate<Integer> predicate) {
        System.out.println(predicate.test(num));
    }
}
