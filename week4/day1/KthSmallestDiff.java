package day1;

import java.util.Arrays;

/*
We are given an array of size n containing positive integers. 
The absolute difference between values at indices i and j is |a[i] – a[j]|. 
There are n*(n-1)/2 such pairs and we are asked to print the 
kth (1 <= k <= n*(n-1)/2) the smallest absolute difference among all 
these pairs.
*/
public class KthSmallestDiff {
    public static void main(String[] args) {
        
    }

    private static int pairCount(int []arr, int k) {
        return 0;
    }

    private static int countPairs(int []arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int highDiff = arr[n-1] - arr[0];
        int lowDiff = Integer.MAX_VALUE;
        for(int i=1; i<n;i++) {
            lowDiff = Math.min(lowDiff, arr[i]-arr[i-1]);
        }
        while (lowDiff < highDiff) {
            int mid = lowDiff + (highDiff-lowDiff)/2;
            if (pairCount(arr, k) < k) {
                lowDiff = mid + 1;
            } else {
                highDiff = mid;
            }
        }
        return lowDiff;
    }
}
