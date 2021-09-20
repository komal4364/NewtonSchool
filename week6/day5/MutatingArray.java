package day5;

import java.util.Arrays;
import java.util.Scanner;

public class MutatingArray {
    public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int numtestCases = in.nextInt();
		while (numtestCases > 0) {
			int N = in.nextInt(), target = in.nextInt();
			int []arr = new int[N];
			for (int i = 0; i <N; i++) {
				arr[i] = in.nextInt();
			}
        	int result = findBestValue(arr, target);
			System.out.println(result);
			numtestCases--;
		}
		in.close();
	}

	public static int findBestValue(int[] arr, int target) {
		Arrays.sort(arr);

        int i = 0;

        while (i < arr.length && target - arr[i] * (arr.length-i) > 0) {
            target = target - arr[i];
            i = i+1;
        }
        return i == arr.length ? arr[arr.length-1] : (int)Math.round((target)/(arr.length - i));

        /*
		for (int i = 0; i < n; ++i) {
			int ans = (int) Math.round(((float) target - prefix - err) / (n - i));
			if (ans < arr[i])
				return ans;
			prefix += arr[i];
		}

		return arr[n - 1];
        */
  }
}
