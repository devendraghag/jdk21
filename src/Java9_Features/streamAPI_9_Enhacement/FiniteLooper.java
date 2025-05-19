package Java9_Features.streamAPI_9_Enhacement;

import java.util.stream.Stream;

public class FiniteLooper {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n < 10, n -> n + 2)
                .forEach(System.out::println); // 1, 3, 5, 7, 9
    }
}
