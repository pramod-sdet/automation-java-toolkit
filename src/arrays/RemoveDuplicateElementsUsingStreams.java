package arrays;

import java.util.*;

public class RemoveDuplicateElementsUsingStreams {

    public static void main(String[] args) {

        int a[] = {20, 10, 30, 20, 10, 40}; 
        // Input array containing duplicate elements

        Set<Integer> dataSet = new LinkedHashSet<>();
        // LinkedHashSet removes duplicates AND maintains insertion order

        for (int data : a) {
            dataSet.add(data);
            // Add each element → duplicates automatically ignored
        }

        int result[] = dataSet.stream()
                              .mapToInt(Integer::intValue)
                              // Convert Integer objects → primitive int
                              .toArray();
                              // Convert stream → array

        System.out.println(Arrays.toString(result));
        // Print final array with unique elements
    }
}