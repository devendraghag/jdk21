package FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printNameAge = (name, age) ->
                System.out.println(name + " is " + age + " years old.");
    }
}
