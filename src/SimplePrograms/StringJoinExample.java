package SimplePrograms;

import java.util.Arrays;

public class StringJoinExample {
    public static void main(String[] args) {
        // Using String.join() to join array elements with a delimiter
        String[] fruits = {"Apple", "Banana", "Cherry"};
        String result = String.join(", ", fruits);

        // Print the result
        System.out.println(result); // Output: Apple, Banana, Cherry
    }
}
