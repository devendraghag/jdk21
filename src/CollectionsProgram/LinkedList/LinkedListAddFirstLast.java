package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.addFirst("Wake up");
        tasks.addLast("Sleep");
        tasks.add("Work");

        System.out.println("Tasks: " + tasks);
    }
}
