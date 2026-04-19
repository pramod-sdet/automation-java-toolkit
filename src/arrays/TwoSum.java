package arrays; 
// Defines the package name (helps organize classes in projects)

public class TwoSum { 
// Class declaration

    public static void main(String[] args) { 
    // Entry point of Java program (execution starts here)

        int arr[] = {1, 2, 3, 4, 7, 9, 11, 15}; 
        // Input array (IMPORTANT: must be sorted for 2-pointer approach to work)

        int target = 3; 
        // Target sum we want to find from two elements

        boolean found = false; 
        // Flag to track whether we found a valid pair or not

        int left = 0; 
        // Left pointer starts from beginning (smallest element)

        int right = arr.length - 1; 
        // Right pointer starts from end (largest element)

        while (left < right) { 
        // Loop runs until both pointers meet
        // Ensures we use two different elements

            int sum = arr[left] + arr[right]; 
            // Calculate sum of current pair

            if (sum == target) { 
            // Case 1: If sum matches target → pair found

                System.out.println("Pair found: " + arr[left] + ", " + arr[right]); 
                // Print actual values

                System.out.println("Pair found: " + left + ", " + right); 
                // Print indices of elements

                found = true; 
                // Mark that pair is found

                break; 
                // Exit loop since we found the required pair
            } 
            else if (sum > target) { 
            // Case 2: If sum is greater than target

                right--; 
                // Move right pointer left to reduce sum
                // (since array is sorted, moving left decreases value)
            } 
            else { 
            // Case 3: If sum is less than target

                left++; 
                // Move left pointer right to increase sum
                // (since array is sorted, moving right increases value)
            }
        }

        if (!found) { 
        // After loop, check if no pair was found

            System.out.println("Pair not found"); 
            // Print message if no valid pair exists
        }
    }
}