import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SubarrayModuloMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long M = in.nextLong();
        int []arr = new int[N];
        int i = 0;
        while (i < N) {
            arr[i++] = in.nextInt();
        }
        in.close();
        long result = maxSumSubArrayModuloOptimized(arr, M);
        System.out.println(result);
    }

    
    private static long maxSumSubArrayModuloOptimized(int []arr, long M) {
        long prefixSum = 0, maxSubArraySum = 0;
        TreeMap<Long, Integer> prefixSums = new TreeMap<Long, Integer>();
        prefixSums.put(0L, 0);
        for (int i = 0; i < arr.length; i++) {
            prefixSum = (prefixSum + arr[i] + M) % M;
            maxSubArraySum = Math.max(maxSubArraySum, prefixSum);
            Long pSum = prefixSums.ceilingKey(prefixSum+1);
            if (pSum != null)
                maxSubArraySum = Math.max(maxSubArraySum, prefixSum - pSum + M);
            /*
            for (Long pSum : prefixSums) {
                if (pSum >= prefixSum+1) {
                    maxSubArraySum = Math.max(maxSubArraySum, prefixSum - pSum + M);
                }
            }
            */
            prefixSums.put(prefixSum, i);
        }
        return maxSubArraySum;
    }
    /*
        arr = [6 6 11 15 2] => generating running sum/prefix sum
        sumarr = [6,12,23,38,40]; find sum of elements from index i to j;
        sumarr(j) - sumarr(i-1);
        sum(2, 4) in arr is 28
         40-12 -> 28

    */
    private static long maxSumSubArrayModulo(int []arr, long M) {
        long maxSubArrayModulo = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long currSubArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                currSubArraySum += arr[j];
                if (currSubArraySum%M > maxSubArrayModulo) {
                    maxSubArrayModulo = currSubArraySum%M;
                }
            }
        }
        return maxSubArrayModulo;
    }
}