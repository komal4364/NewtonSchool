import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int []nums = {10, 15, 17, 2, 11};
        merge(nums, 0, 2, 3, 4);
        System.out.println(Arrays.toString(nums)); // [2, 10, 11, 15, 17]
    }

    private static void merge(int []nums, int s1, int e1, int s2, int e2) {
        int len = e1-s1+1 + e2-s2 + 1;
        int []temp = new int[len]; //0, len-1;
        int i = s1, j = s2, k=0;
        while (i<=e1 && j <=e2) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                k++;
                j++;
            }
        }
        while (i<=e1) {
            temp[k] = nums[i];
            k++;
            i++;
        }
        while (j<=e2) {
            temp[k] = nums[j];
            k++;
            j++;
        }
        for (int l=s1;l <= e2; l++) {
            nums[l] = temp[l-s1];
        }
    }
}
