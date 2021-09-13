import java.util.ArrayList;
import java.util.Scanner;

/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
Input
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space-separated integers denoting the array elements. 

Constraints:- 
1 <= N <= 10^5 
1 <= Ai <= 10^5
Output
Print the starting and ending positions (1 indexing) of first such occurring subarray from the left if sum equals to subarray, else print -1.
*/
public class TargetSumSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long targetSum = in.nextLong();
        ArrayList<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add(in.nextInt());
            n--;
        }
        in.close();
        long currSum = 0L;
        int s=0, e=0;
        for (; e < nums.size();) {
            if (currSum == targetSum) {
                break;
            } else if (currSum < targetSum) {
                currSum = currSum + nums.get(e);
                e++;
            } else { //currSum > targetSum
                currSum = currSum - nums.get(s);
                s++;
            }
        }
        if (currSum != targetSum) {
            System.out.println("-1");
        } else {
            System.out.println(s+1 + " " + e);
        }
    }
}
