package CollectionPrograms.TreeSet;

import java.util.*;

public class TreeSetRangeView {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>(Set.of(35, 45, 55, 65, 75));

        System.out.println("HeadSet (<55): " + marks.headSet(55));
        System.out.println("TailSet (>=55): " + marks.tailSet(55));
        System.out.println("SubSet (45 to 75): " + marks.subSet(45, 75));
    }
}
