package OptionalPrograms;

import java.util.Optional;

public class OptionalExample7 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Optional");

        // Using map: wraps the result in an Optional again
        Optional<Optional<String>> mapResult = name.map(val -> Optional.of(val.toUpperCase()));

        // Using flatMap: flattens the result
        Optional<String> flatMapResult = name.flatMap(val -> Optional.of(val.toUpperCase()));

        System.out.println("map(): " + mapResult.get().get());
        System.out.println("flatMap(): " + flatMapResult.get());
    }
}
