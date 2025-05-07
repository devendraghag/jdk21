package OptionalPrograms;

import java.util.Optional;

class User2 {
    private final String name;

    public User2(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

public class OptionalExample8 {
    public static void main(String[] args) {
        User2 user = new User2(null);

        // Safe call without NPE
        String name = user.getName().orElse("Anonymous");
        System.out.println("Name: " + name);
    }
}
