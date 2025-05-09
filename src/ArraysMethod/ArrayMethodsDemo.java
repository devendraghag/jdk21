package ArraysMethod;

import java.util.Arrays;

public class ArrayMethodsDemo {

    public static void main(String[] args) {
        toStringExample();
        sortExample();
        copyOfExample();
        copyOfRangeExample();
        equalsExample();
        fillExample();
        binarySearchExample();
        setAllExample();
        streamExample();
        deepToStringExample();
        manualTraversalExample();

        String str = "Hello";
        char[] chars = str.toCharArray();

        for (char c : chars) {
            System.out.print(c + " ");  // H e l l o
        }

    String str1 = "Java";
    char[] chars1 = str1.toCharArray();

for (int i = chars1.length - 1; i >= 0; i--) {
        System.out.print(chars1[i]);  // avaJ
    }
    }

    static void toStringExample() {
        int[] arr = {1, 2, 3};
        System.out.println("toString: " + Arrays.toString(arr));
    }

    static void sortExample() {
        int[] arr = {5, 3, 2};
        Arrays.sort(arr);
        System.out.println("sort: " + Arrays.toString(arr));
    }

    static void copyOfExample() {
        int[] arr = {1, 2, 3};
        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println("copyOf: " + Arrays.toString(copy));
    }

    static void copyOfRangeExample() {
        int[] arr = {10, 20, 30, 40};
        int[] sub = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("copyOfRange: " + Arrays.toString(sub));
    }

    static void equalsExample() {
        int[] a = {1, 2};
        int[] b = {1, 2};
        System.out.println("equals: " + Arrays.equals(a, b));
    }

    static void fillExample() {
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println("fill: " + Arrays.toString(arr));
    }

    static void binarySearchExample() {
        int[] arr = {10, 20, 30, 40};
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("binarySearch (30): " + index);
    }

    static void setAllExample() {
        int[] arr = new int[5];
        Arrays.setAll(arr, i -> i * i);
        System.out.println("setAll: " + Arrays.toString(arr));
    }

    static void streamExample() {
        int[] arr = {1, 2, 3};
        int sum = Arrays.stream(arr).sum();
        System.out.println("stream sum: " + sum);
    }

    static void deepToStringExample() {
        int[][] arr = {{1, 2}, {3, 4}};
        System.out.println("deepToString: " + Arrays.deepToString(arr));
    }

    static void manualTraversalExample() {
        int[] arr = {1, 2, 3};
        System.out.print("manualTraversal: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
