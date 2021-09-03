import java.util.Scanner;

/*
standard input/output: 2s/128000 kB

Given a string(1-indexed). Print all the characters of the string at odd positions.
Input
The first line of the input contains a string S. String contains only lowercase english letters. 

Constraints:- 
1 <= |S| <= 100 
Output
The output should contain the character's at odd positions seperated by space.
*/
public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String input = in.nextLine().trim();
		for (int i = 1; i <= input.length(); i++) {
			if ((i) % 2 == 0) { //even position
				continue;
			}
			System.out.print(input.charAt(i-1) + " ");
		}
		in.close();
        System.out.println();
    }
}
