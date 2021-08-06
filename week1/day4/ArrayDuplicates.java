package day4;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDuplicates {
    public static void main(String[] args) {
        Integer []arr = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 };
        Long start = System.nanoTime();
        boolean res = DuplicatesBruteForceDemo(arr);
        Long end = System.nanoTime();
        System.out.println("res:" + res + " brute force duration :" + (end-start));
        start = System.nanoTime();
        res = DuplicatesExtraSpaceDemo(arr);
        end = System.nanoTime();
        System.out.println("res:" + res + " extra space duration :" + (end-start));

        start = System.nanoTime();
        res = DuplicatesSortDemo(arr);
        end = System.nanoTime();
        System.out.println("res:" + res + " sort duration :" + (end-start));
    }

    static boolean DuplicatesSortDemo(Integer []array) {
        Arrays.sort(array); //Inplace sorting
        for (int i=0; i< array.length-1; i++)
            if (array[i] == array[i+1])
                return true;
        return false;
    }

    static boolean DuplicatesBruteForceDemo(Integer []array) {
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] != null && array[i].equals(array[j]))
                    return true;
        return false;
    }

    static boolean DuplicatesExtraSpaceDemo(Integer []arr) {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found
            // a duplicate within k distance
            if (set.contains(arr[i]))
               return true;
 
            // Add this item to hashset
            set.add(arr[i]);
        }
        return false;
    }
}
