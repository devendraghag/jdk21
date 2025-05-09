package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum); // 10



        List<String> words = Arrays.asList("apple", "banana", "pear", "watermelon");
        String longest = words.stream().reduce("", (word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        System.out.println("Longest word: " + longest); // watermelon

        //T result = stream.reduce(identity, accumulator);
        //identity – the initial/default value ("" here, an empty string).
        //accumulator – a function that takes two elements and returns one (used to combine them).
        //(word1, word2) -> word1.length() > word2.length() ? word1 : word2
    }
}
