package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo2 implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }

    public static void main(String args[]) {
        PredicateDemo2 predicate = new PredicateDemo2();
        System.out.println(predicate.test(1111));
    }
}
