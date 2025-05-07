package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo5 {
    public static void main(String args[]) {
        Predicate<Integer> predicate = PredicateDemo5::isEven;
        System.out.println(predicate.test(1111));
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
