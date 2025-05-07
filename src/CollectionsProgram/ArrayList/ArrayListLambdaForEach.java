package CollectionsProgram.ArrayList;

import java.util.*;

public class ArrayListLambdaForEach {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(List.of(70, 80, 90));
        marks.forEach(mark -> System.out.println("Mark: " + mark));
    }
}
