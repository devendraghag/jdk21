package OptionalPrograms;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        // Creating Optional with value
        Optional<String> opt = Optional.of("Hello Optional");
        System.out.println(opt.get());

        // Creating empty Optional
        Optional<String> emptyOpt = Optional.empty();
        System.out.println("Is empty: " + emptyOpt.isPresent());

        // Creating Optional that may be null
        String name = null;
        Optional<String> nullableOpt = Optional.ofNullable(name);
        System.out.println("Is present: " + nullableOpt.isPresent());
    }
}
