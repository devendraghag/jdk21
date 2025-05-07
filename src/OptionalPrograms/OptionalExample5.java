package OptionalPrograms;

import java.util.Optional;

public class OptionalExample5 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");

        // Filter only passes value if condition matches
        name = name.filter(n -> n.startsWith("J"));
        name.ifPresent(System.out::println);
    }
}
