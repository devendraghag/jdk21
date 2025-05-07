package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, String> startsWith = (str, prefix) -> str.startsWith(prefix);
        System.out.println(startsWith.test("ChatGPT", "Chat")); // true
        System.out.println(startsWith.test("ChatGPT", "GPT"));  // false
    }
}
