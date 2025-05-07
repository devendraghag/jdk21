package ArraysMethod;

import java.util.Arrays;
import java.util.stream.IntStream;

class ProductArrayOperations {

    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] productIds = {104, 102, 108, 101, 103};

        // 2. Print original array
        System.out.println("Original Array: " + Arrays.toString(productIds));

        // 3. Sort the array
        Arrays.sort(productIds);
        System.out.println("Sorted Array: " + Arrays.toString(productIds));

        // 4. Copy array to new array with different length
        int[] newProductIds = Arrays.copyOf(productIds, 7);
        System.out.println("Copied Array (length 7): " + Arrays.toString(newProductIds));

        // 5. Fill remaining elements
        Arrays.fill(newProductIds, 5, 7, -1);  // Fill last two with -1
        System.out.println("Filled Array: " + Arrays.toString(newProductIds));

        // 6. Binary search
        int index = Arrays.binarySearch(productIds, 103);
        System.out.println("Index of product ID 103: " + index);

        // 7. Check equality
        int[] productIdsClone = Arrays.copyOf(productIds, productIds.length);
        boolean isEqual = Arrays.equals(productIds, productIdsClone);
        System.out.println("Original and clone arrays are equal: " + isEqual);

        // 8. Using System.arraycopy
        int[] productIdsBackup = new int[productIds.length];
        System.arraycopy(productIds, 0, productIdsBackup, 0, productIds.length);
        System.out.println("Backup using System.arraycopy: " + Arrays.toString(productIdsBackup));

        // 9. Sum using Streams
        int total = Arrays.stream(productIds).sum();
        System.out.println("Sum of Product IDs: " + total);

        // 10. Filter values > 103 using Streams
        int[] filtered = Arrays.stream(productIds)
                               .filter(id -> id > 103)
                               .toArray();
        System.out.println("Filtered IDs > 103: " + Arrays.toString(filtered));

        // 11. Max and count using Streams
        int maxId = Arrays.stream(productIds).max().orElse(-1);
        long count = Arrays.stream(productIds).count();
        System.out.println("Max Product ID: " + maxId);
        System.out.println("Total Count: " + count);
    }
}
