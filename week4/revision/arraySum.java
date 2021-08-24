package revision;

import java.util.Arrays;
import java.util.Scanner;

/*
arr = [2, 3, 5, 9, 1] (0, n-1)
sum(arr, 0, 4) = arr[4] + sum(arr, 0, 3);
               = 1 + sum(arr, 0, 3);
//sum(arr, 0, n-1) -> returns the sum of elements in arr from
// index 0 to index n-1
//sum(arr, 0, n-2) -> returns sum of elements in arr from
// index 0 to index n-2;
sum(arr, 0, n-1) = arr[n-1] + sum(arr, 0, n-2);
sum(arr, 0, n-2) = arr[n-2] + sum(arr, 0, n-3);
arr = [2];
sum(arr, 0, 0) => return arr[0];
*/
/*
5
4 2 3 1 8
*/
public class arraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases > 0) {
            System.out.println("Enter the array input size:");
            int n = in.nextInt();
            int []arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("input array: " + Arrays.toString(arr));
            int result = sumArr(arr, 0, n-1);
            System.out.println("result: " + result);
            testCases = testCases-1;
        }
        in.close();
    }
    static int sumArr(int []inp, int s, int e) {
        if (s == e) {
            return inp[s];
        }
        return inp[e] + sumArr(inp, s, e-1);
    }
}
