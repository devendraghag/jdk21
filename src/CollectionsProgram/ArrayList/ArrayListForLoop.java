package CollectionsProgram.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }
}
