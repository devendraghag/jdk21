package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>(List.of("Toyota", "Honda", "BMW"));
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println("Car: " + iterator.next());
        }
    }
}
