import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
    Given an array Arr, of N integers find the sum of max(A[i], A[j]) 
    for all i, j such that i < j.
    Input
    The first line of the input contains an integer N, the size of the array. 
    The second line of the input contains N integers, the elements of the array Arr. 

    Constraints 
    1 <= N <= 100000 
    1 <= Arr[i] <= 100000000
    Output
    Print a single integer which is the sum of min(A[i], A[j]) for all i, j such that i < j.
*/
public class pairsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long []arr = new long[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr, 1, N+1);
        long result = 0;
        for (int i = 1; i <= N; i++) {
            result += (arr[i]*(i-1));
        }
        System.out.println(result);
    }
}
