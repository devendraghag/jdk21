package OptionalPrograms;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        String nullName = null;

        Optional<String> nameOpt = Optional.ofNullable(nullName);

        // Returns default value
        String name1 = nameOpt.orElse("Default Name");
        System.out.println(name1);

        // Returns result of a supplier function
        String name2 = nameOpt.orElseGet(() -> "Generated Default");
        System.out.println(name2);
    }
}
