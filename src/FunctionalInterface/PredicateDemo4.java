package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo4 {
    public static void main(String args[]) {
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println(predicate.test(1111));
    }
}
