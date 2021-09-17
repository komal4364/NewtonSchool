package day5;

import java.util.Arrays;

public class MutateArray {
	public static int findBestValue(int[] arr, int target) {
		Arrays.sort(arr);

        int i = 0;

        while (i < arr.length && target - arr[i] * (arr.length-i) > 0) {
            target = target - arr[i];
            i = i+1;
        }
        return i == arr.length ? arr[arr.length-1] : (int)Math.round((target-0.0000000001)/(arr.length - i));
  	}
}