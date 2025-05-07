package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo3 {
    public static void main(String args[]) {
        Consumer<Integer> consumer = t -> System.out.println("Printing " + t);
        consumer.accept(1111);
    }
}
