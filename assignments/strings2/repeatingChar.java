/*
standard input/output: 2s/128000 kB

You are given a string S (containing only lowercase characters). You need to print the repeated character whose first appearance is leftmost.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. 
Each testcase contains one line of input containing the string S. 

Constraints: 
1 <= T <= 100 
1 <= |S| <= 1000
Output
For each testcase, in a new line, print the character. If not found then print "-1".
*/
import java.util.Scanner;

public class repeatingChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            String str = sc.next();
            int index = repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        }
        sc.close();
    }

    static int repeatedCharacter(String S) {
        int firstIndex[]= new int[256]; 
        for (int i = 0; i <256; i++) 
            firstIndex[i] = -1; 
          
        int res = Integer.MAX_VALUE; 
        for (int i = 0; i < S.length(); i++) { 
            if (firstIndex[S.charAt(i)] == -1) 
                firstIndex[S.charAt(i)] = i; 
            else
                res = Math.min(res, firstIndex[S.charAt(i)]); 
        }
        return (res == Integer.MAX_VALUE) ? - 1 : res;
    }
}
