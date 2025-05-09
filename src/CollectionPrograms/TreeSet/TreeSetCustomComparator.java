package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetCustomComparator {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>(Comparator.reverseOrder());
        scores.add(45);
        scores.add(67);
        scores.add(23);

        System.out.println("Descending Scores: " + scores);
    }
}
