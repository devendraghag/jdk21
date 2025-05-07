package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
