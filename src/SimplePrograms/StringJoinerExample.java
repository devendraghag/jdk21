package SimplePrograms;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Create a StringJoiner with a delimiter, prefix, and suffix
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Add strings to the StringJoiner
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Convert to String and print
        System.out.println(joiner.toString()); // Output: [Apple, Banana, Cherry]
    }
}
