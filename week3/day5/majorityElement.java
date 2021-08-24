import java.util.Arrays;
import java.util.Scanner;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
*/
public class majorityElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []inp = in.nextLine().split(" ");
        int []nums = new int[inp.length];
        for (int i=0;i<inp.length;i++) {
            nums[i] = Integer.parseInt(inp[i]);
        }
        System.out.println(majorityElem(nums));
        in.close();
    }
    private static int majorityElem(int []nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
