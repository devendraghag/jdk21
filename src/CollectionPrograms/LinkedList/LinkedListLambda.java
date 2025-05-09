package CollectionPrograms.LinkedList;

import java.util.*;

public class LinkedListLambda {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>(List.of("India", "USA", "Canada"));
        countries.forEach(country -> System.out.println("Country: " + country));
    }
}
