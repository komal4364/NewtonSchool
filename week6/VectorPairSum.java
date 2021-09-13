import java.util.Scanner;
import java.util.Vector;


/*
standard input/output: 2s/128000 kB

Pairs and vectors can be used together to achieve some amazing results. Here we will learn to use a vector that holds pairs. 
You are given a vector V of size N. The vector hold pair of integers. Example V={(1,2),(3,4)...}. Now, you need to sum the second elements.
Input
First line contains N denoting the size of the array. The second line contains 2*N elements where the (2i - 1)'th and (2i)'th element represent the i'th pair. 

Constraints: 

1 <= N <= 10^5 
0 <= Vi <= 10^5
Output
For each testcase, in a new line, print the required output.

Input:
5
1 2 3 4 5 6 7 8 9 10

Output:
30

Explanation:
Sum = 10+8+6+4+2 = 30
*/
public class VectorPairSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Vector<Pair> nums = new Vector<Pair>();
        Long result = 0L;
        while (N > 0) {
            Pair p = new Pair(in.nextInt(), in.nextInt());
            nums.add(p);
            result += p.value;
            N = N-1;
        }
        in.close();
        System.out.println(result);
    }
}
