package OptionalPrograms;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");

        // Executes only if value is present
        opt.ifPresent(value -> System.out.println("Value: " + value));
    }
}
