package FunctionalInterface;

import java.util.function.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String args[]) {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Printing " + t);
            }
        };
        consumer.accept(1111);
    }
}
