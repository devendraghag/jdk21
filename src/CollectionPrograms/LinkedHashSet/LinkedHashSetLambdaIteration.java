package CollectionPrograms.LinkedHashSet;

import java.util.*;

public class LinkedHashSetLambdaIteration {
    public static void main(String[] args) {
        LinkedHashSet<String> countries = new LinkedHashSet<>(Set.of("India", "USA", "UK"));
        countries.forEach(country -> System.out.println("Country: " + country));
    }
}
