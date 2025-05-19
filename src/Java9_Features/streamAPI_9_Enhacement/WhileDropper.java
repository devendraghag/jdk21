package Java9_Features.streamAPI_9_Enhacement;

import java.util.List;
import java.util.stream.Collectors;

public class WhileDropper {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 3, 5, 7);

        List<Integer> result = numbers.stream()
                .dropWhile(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Remaining Numbers After Drop: " + result); // Starts from 3
    }
}
