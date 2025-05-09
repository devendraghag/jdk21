package CollectionPrograms.LinkedList;

import java.util.*;

public class LinkedListAccessModify {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(List.of(10, 20, 30));
        int first = numbers.getFirst();
        int last = numbers.getLast();

        numbers.set(1, 25); // Modify second element

        System.out.println("First: " + first + ", Last: " + last);
        System.out.println("Modified List: " + numbers);
    }
}
