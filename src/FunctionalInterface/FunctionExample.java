package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length: " + stringLength.apply("ChatGPT"));
    }
}
