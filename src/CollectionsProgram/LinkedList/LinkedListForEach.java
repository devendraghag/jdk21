package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListForEach {
    public static void main(String[] args) {
        LinkedList<Double> prices = new LinkedList<>(List.of(12.5, 9.99, 5.75));
        for (Double price : prices) {
            System.out.println("Price: " + price);
        }
    }
}
