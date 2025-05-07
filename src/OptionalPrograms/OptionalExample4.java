package OptionalPrograms;

import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);

        // Throws exception if value not present
        String value = opt.orElseThrow(() -> new RuntimeException("Value not found"));
        System.out.println(value);
    }
}
