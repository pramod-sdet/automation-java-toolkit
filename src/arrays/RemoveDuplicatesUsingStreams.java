package arrays;

import java.util.Arrays;

public class RemoveDuplicatesUsingStreams {
    public static void main(String[] args) {

        int a[] = {20, 10, 30, 20, 10, 40}; 
        // Input array with duplicates

        int[] result = Arrays.stream(a)
                             .distinct()
                             // Removes duplicate elements
                             .toArray();
                             // Converts stream back to array

        System.out.println(Arrays.toString(result));
        // Prints: [20, 10, 30, 40]
    }
}