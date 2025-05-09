package CollectionPrograms.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToArrayListExamples {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry"};

        // 1. Using Arrays.asList() - fixed-size list
        List<String> fixedSizeList = Arrays.asList(array);
        System.out.println("1. Arrays.asList(): " + fixedSizeList);

        // 2. Using ArrayList constructor
        ArrayList<String> arrayListConstructor = new ArrayList<>(Arrays.asList(array));
        arrayListConstructor.add("Date");
        System.out.println("2. ArrayList Constructor: " + arrayListConstructor);

        // 3. Using Collections.addAll()
        ArrayList<String> arrayListAddAll = new ArrayList<>();
        Collections.addAll(arrayListAddAll, array);
        arrayListAddAll.add("Elderberry");
        System.out.println("3. Collections.addAll(): " + arrayListAddAll);

        // 4. Using Java 8 Streams
        List<String> streamList = Arrays.stream(array).collect(Collectors.toList());
        System.out.println("4. Java 8 Stream: " + streamList);

        // 5. Manual conversion using for-each loop
        ArrayList<String> manualList = new ArrayList<>();
        for (String fruit : array) {
            manualList.add(fruit);
        }
        manualList.add("Fig");
        System.out.println("5. Manual Loop: " + manualList);
    }
}
