package CollectionsClass;

import java.util.*;

public class CollectionsUtilityMethodsDemo {
    public static void main(String[] args) {
        // 1. Collections.sort()
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1));
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers); // [1, 2, 5, 8]

        // 2. Collections.reverse()
        List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.reverse(letters);
        System.out.println("Reversed: " + letters); // [C, B, A]

        // 3. Collections.shuffle()
        List<Integer> shuffleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(shuffleList);
        System.out.println("Shuffled: " + shuffleList); // Random order

        // 4. Collections.max() and Collections.min()
        List<Integer> values = Arrays.asList(3, 7, 2, 9);
        System.out.println("Max: " + Collections.max(values)); // 9
        System.out.println("Min: " + Collections.min(values)); // 2

        // 5. Collections.frequency()
        List<String> freqList = Arrays.asList("A", "B", "A", "C", "A");
        int freq = Collections.frequency(freqList, "A");
        System.out.println("Frequency of 'A': " + freq); // 3

        // 6. Collections.replaceAll()
        List<String> animals = new ArrayList<>(Arrays.asList("dog", "cat", "dog"));
        Collections.replaceAll(animals, "dog", "wolf");
        System.out.println("Replaced: " + animals); // [wolf, cat, wolf]

        // 7. Collections.copy()
        List<String> src = Arrays.asList("X", "Y", "Z");
        List<String> dest = new ArrayList<>(Arrays.asList("1", "2", "3"));
        Collections.copy(dest, src);
        System.out.println("Copied list: " + dest); // [X, Y, Z]

        // 8. Collections.fill()
        List<String> fillList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.fill(fillList, "X");
        System.out.println("Filled: " + fillList); // [X, X, X]

        // 9. Collections.unmodifiableList()
        List<String> modifiable = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> unmodifiable = Collections.unmodifiableList(modifiable);
        System.out.println("Unmodifiable: " + unmodifiable);
        // unmodifiable.add("C"); // Uncommenting will throw UnsupportedOperationException

        // 10. Collections.synchronizedList()
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Thread-safe A");
        System.out.println("Synchronized List: " + syncList);
    }
}
