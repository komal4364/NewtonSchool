package matrixSearch;

import java.util.Arrays;
import java.util.Scanner;

public class matrixSearch {
    private static void printMatrix(int [][]arr) {
        System.out.println("************ Array Print Start ************");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("************ Array Print End ************");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(), N = in.nextInt(), Q = in.nextInt();
        int [][]arr = new int[M][N];
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        int []targets = new int[Q];
        for (int q = 0; q < Q; q++) {
            targets[q] = in.nextInt();
        }
        in.close();
        for (int q = 0; q < Q; q++) {
            //boolean result = searchTargetBruteForce(arr, targets[q]);
            boolean result = searchTargetImprovised(arr, targets[q]);
            System.out.println(result == true ? "Yes" : "No");
        }
        //printMatrix(arr);
    }

    private static boolean searchTargetBruteForce(int [][]arr, int target) {
        int M = arr.length, N= arr[0].length;
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void sortMatrix(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }

    private static boolean binarySearch(int []arr, int target) {
        int s = 0, e = arr.length-1;
        while (s <= e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return false;
    }

    private static boolean searchTargetOptimal(int [][]arr, int target) {
        int M = arr.length;
        sortMatrix(arr);
        for (int row = 0; row < M; row++) {
            boolean found = binarySearch(arr[row], target);
            if (found == true) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchTargetImprovised(int [][]arr, int target) {
        int []input = new int[arr.length * arr[0].length];
        int k = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                input[k++] = arr[row][col];
            }
        }
        Arrays.sort(input);
        return binarySearch(input, target);
    }
}
