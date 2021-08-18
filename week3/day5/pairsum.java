import java.util.Arrays;

public class pairsum {
    public static void main(String[] args) {
        int []arr = {2, 5, 12, 42, 1};
        int target = 16;
        System.out.println("brute force: " + pairSumBruteForce(arr, target));
        System.out.println("optimal sort: " + pairSumOptimal(arr, target));
    }

    static boolean pairSumBruteForce(int []arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean pairSumOptimal(int []arr, int target) {
        Arrays.sort(arr);
        int i =0, j = arr.length-1;
        while (i < j) {
            int currSum = arr[i]+arr[j];
            if (currSum == target) {
                 return true;
            } else if (currSum < target) {
                i = i + 1;
            } else {
                j = j - 1;
            }
        }
        return false;
    }
}
