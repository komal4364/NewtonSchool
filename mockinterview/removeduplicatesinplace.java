import java.util.Arrays;
import java.util.Scanner;

/* "1,2,3,4,5" => ["1", "2", 3, 4, 5] */
public class removeduplicatesinplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        in.close();
        String []numStr = inp.split(",");
        int []nums = new int[numStr.length]; 
        for (int i = 0; i < numStr.length; i++) {
            nums[i] = Integer.parseInt(numStr[i]);
        }
     
        int i = 0, j = 0;
        while (j < nums.length) { //j is eagerly moving to find a duplicate.
            if (nums[i] == nums[j]) { //u r looking a duplicate; u increment j;
                j++;
            } else { // non duplicates;
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println(i+1 + " " + Arrays.toString(nums));
    }
}
