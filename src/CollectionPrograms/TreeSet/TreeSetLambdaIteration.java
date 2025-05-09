package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetLambdaIteration {
    public static void main(String[] args) {
        TreeSet<Double> grades = new TreeSet<>(Set.of(89.5, 77.0, 92.3));
        grades.forEach(g -> System.out.println("Grade: " + g));
    }
}
