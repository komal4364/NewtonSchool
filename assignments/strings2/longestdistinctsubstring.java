import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
standard input/output: 2s/128000 kB

Given a string S, find the length of the longest substring with all distinct characters of string S. 
For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
Input
The first line of input contains an integer T denoting the number of test cases. 
The first and the only line of each test case contains the string S. 

Constraints: 
1 ≤ T ≤ 100 
1 ≤ length of S ≤ 1000
Output
Print length of longest substring containing all the distinct characters of string. 
Note: The output substring should have all distinct characters.
*/
public class longestdistinctsubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String inp = in.next();
            solve(inp);
        }
        in.close();
    }
    private static void solve(String inp) {
        Map<Character, Integer> lookup = new HashMap<Character, Integer>();
        Integer start = 0, end = 0, result = Integer.MIN_VALUE;
        for (int i = 0; i < inp.length(); i++) {
            Character ch = inp.charAt(i);
            if (lookup.get(ch) == null) { //the char is not seen before. so include it in the current window.
                lookup.put(ch, i);
                result = Math.max(result, end-start+1);
            } else {
                int idx = lookup.get(ch);
                while (start <= idx) {
                    lookup.put(inp.charAt(start), null);
                    start++;
                }
                start = idx + 1;
                lookup.put(ch, i);
            }
            end = end + 1;
        }
        System.out.println(result);
    }
}
