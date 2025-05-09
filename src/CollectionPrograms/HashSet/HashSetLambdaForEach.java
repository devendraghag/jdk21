package CollectionPrograms.HashSet;

import java.util.*;

public class HashSetLambdaForEach {
    public static void main(String[] args) {
        HashSet<Double> scores = new HashSet<>(Set.of(89.5, 76.0, 90.0));
        scores.forEach(score -> System.out.println("Score: " + score));
    }
}
