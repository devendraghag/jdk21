package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Anna", "Amanda");
        boolean result = names.stream().allMatch(name -> name.startsWith("A"));
        System.out.println("All names start with A?: " + result); // true


        List<Integer> values = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        System.out.println(values.stream().allMatch(num -> num %2 == 0));
    }
}
