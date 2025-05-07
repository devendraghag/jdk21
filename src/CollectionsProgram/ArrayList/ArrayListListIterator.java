package CollectionsProgram.ArrayList;

import java.util.*;

public class ArrayListListIterator {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(List.of("Cat", "Dog", "Elephant"));
        ListIterator<String> listIt = animals.listIterator();

        System.out.println("Forward:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }
}
