import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int []nums = {-7,-3,2,3,11};
        double []out = sortedSquare(nums);
        System.out.println(Arrays.toString(out));
    }
    
    public static double[] sortedSquare(int[] nums) {
        int i=0, j=nums.length-1, k=nums.length-1;
        double []out = new double[nums.length];
        while (j >= i) {
            if (nums[i]*nums[i]>nums[j]*nums[j]) { //
                out[k] = Math.pow(nums[i], 2);
                i = i+1;
            } else {
                out[k] = Math.pow(nums[j], 2);
                j = j-1;
            }
            k = k-1;
        }
        return out;
    }
}
