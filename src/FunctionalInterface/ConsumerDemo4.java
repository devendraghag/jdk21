package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo4 {
    public static void main(String args[]) {
        Consumer<Integer> consumer = ConsumerDemo4::printValue;
        consumer.accept(1111);
    }

    public static void printValue(Integer t) {
        System.out.println("Printing " + t);
    }
}
