import java.util.Scanner;

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
        long result = maxSumSubArrayModulo(arr, M);
        System.out.println(result);
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