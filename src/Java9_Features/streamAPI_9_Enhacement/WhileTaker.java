package Java9_Features.streamAPI_9_Enhacement;

import java.util.List;
import java.util.stream.Collectors;

public class WhileTaker {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10, 3, 5, 7);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Taken Even Numbers: " + result); // Stops at first odd
    }
}
