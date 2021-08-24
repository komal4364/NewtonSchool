

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 14, 7, 3, 12, 9, 11, 6, 2 };
        MergeSort sol = new MergeSort();
        arr = sol.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    private void mergeSort(int []nums, int start, int end) { //start-end is sorted when this function returns;
        if (start >= end) {
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(nums, start, mid); //start->mid 
        mergeSort(nums, mid+1, end); //mid+->end will be sorted.
        merge(nums, start, mid, mid+1, end); //merge (start, mid), (mid+1, end)
    }
    // nums = [10, 15, 17, 2, 11]; start1=0, end1=2, start2=3, end2=4;
    private void merge(int []nums, int start1, int end1, int start2, int end2) {
        if (nums[end1] <= nums[start2]) {
            return;
        }
        int []temp = new int[end2-start1+1]; //end2-start1+1;
        int i = start1;
        int j = start2;
        int k = 0;//output temp array
        while (i <= end1 && j <= end2) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];

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
    }
}