package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isLong = str -> str.length() > 5;
        System.out.println(isLong.test("hello"));      // false
        System.out.println(isLong.test("functional")); // true
    }
}
