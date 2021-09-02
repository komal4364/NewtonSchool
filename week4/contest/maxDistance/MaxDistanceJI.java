package maxDistance;

import java.util.Scanner;

public class MaxDistanceJI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        //read array input of integers from the user
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        int []result = maxDistanceOptimized(arr);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    /* function to find the index(j) of an element to it's right such that the index(i)
    difference is maximized (j-i) keeping the constraint arr[j] >= arr[i];
    */
    // [5, 2, 4, 3, 1]
    private static int[] maxDistance(int []arr) {
        int []result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { //i=0
            int maxDiff = Integer.MIN_VALUE; // -2^31
            for (int j = i; j < arr.length; j++) { //j=0;
                if (arr[j]>=arr[i]) {
                    maxDiff = Math.max(maxDiff, j-i);
                    result[i] = j+1;
                }
            }
        }
        return result;
    }

    private static int[] maxDistanceOptimized(int []arr) {
        int []result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { //i=0
            int maxDiff = Integer.MIN_VALUE; // -2^31
            for (int j = arr.length-1; j >=0 ; j--) { //j=0;
                if (arr[j]>=arr[i]) {
                    maxDiff = Math.max(maxDiff, j-i);
                    result[i] = j+1;
                    break;
                }
            }
        }
        return result;
    }
}
