package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo7 {
    public static void main(String args[]) {
        applyConsumer(1111, t -> System.out.println("Printing " + t));
    }

    public static void applyConsumer(Integer t, Consumer<Integer> consumer) {
        consumer.accept(t);
    }
}
