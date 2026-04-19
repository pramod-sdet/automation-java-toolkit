package arrays;

import java.util.HashSet;

public class FindDuplicateFromArray {

    public static void main(String[] args) {

        int a[] = {1,2,3,7,2,9,5,8,7};

        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {

            if (set.contains(num)) {  
                System.out.println("Duplicate: " + num);
            } else {
                set.add(num);          // add if not present
            }
        }
    }
}