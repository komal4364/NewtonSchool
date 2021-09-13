import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
standard input/output: 2s/128000 kB

You are given an array A of size N, and you are also given a sum. You need to find if two numbers in A exists such that their sum is equal to the given sum. If yes, print 1, else print 0.
Input
The first line contains N denoting the size of the array A and target sum. The second line contains N elements of the array. The third line contains element sum. 

Constraints: 
1 <= N <= 100000 
1 <= A[i] <= 1000000
Output
Print 1, if there is an occurrence of the sum, else print 0.
*/
public class PairSumExistence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), target = in.nextInt();
        Set<Integer> nums = new HashSet<Integer>();
        while (n > 0) {
            nums.add(in.nextInt());
            n--;
        }
        in.close();
        boolean exists = false;
        for (Integer num : nums) {
            int temp = Math.abs(target - num);
            if (nums.contains(temp)) {
                exists = true;
                break;
            }
        }
        System.out.println(exists == true? "1":"0");
    }
}
