

import java.util.Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 20, 10, 2 };
        InversionCount sol = new InversionCount();
        arr = sol.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] sortArray(int[] nums) {
        int invCount = mergeSort(nums, 0, nums.length-1);
        System.out.println(invCount);
        return nums;
    }
    private int mergeSort(int []nums, int start, int end) {
        int invCount = 0;
        if (start >= end) {
            return invCount;
        }
        
        int mid = start + (end - start)/2;
        invCount = invCount + mergeSort(nums, start, mid);
        invCount = invCount + mergeSort(nums, mid+1, end);
        invCount = invCount + merge(nums, start, mid, mid+1, end);
        return invCount;
    }
    private int merge(int []nums, int start1, int end1, int start2, int end2) {
        int invCount = 0;
        if (nums[end1] <= nums[start2]) {
            return invCount;
        }
        int []temp = new int[end2-start1+1];
        int i = start1;
        int j = start2;
        int k = 0;
        while (i <= end1 && j <= end2) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                invCount = invCount + (end1-i+1);
            }
        }
        while (i <= end1) {
            temp[k++] = nums[i++];
        }
        while (j <= end2) {
            temp[k++] = nums[j++];
        }
        for (int l=start1;l <= end2; l++) {
            nums[l] = temp[l-start1];
        }
        return invCount;
    }
}
