package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo1 implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if(integer%2==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        PredicateDemo1 predicate = new PredicateDemo1();
        System.out.println(predicate.test(1111));
    }


}
