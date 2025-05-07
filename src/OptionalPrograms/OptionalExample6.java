package OptionalPrograms;

import java.util.Optional;

public class OptionalExample6 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");

        // Convert value to uppercase
        Optional<String> upperName = name.map(String::toUpperCase);
        System.out.println(upperName.get());
    }
}
