import java.util.Scanner;
import java.util.Stack;

/*
standard input/output: 2s/128000 kB

Given an infix expression, your task is to convert it into postfix. 

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands. 
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands. 

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'. 

See example for better understanding.
Input
The input contains a single string of infix expression. 

Constraints:- 
1 <= |String| <= 40
Output
Output the Postfix expression.
*/
public class infixtopostfix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        in.close();
        solve(inp);
    }
    private static void solve(String inp) {
        Stack<String> stk = new Stack<String>();
        for (int i = 0; i < inp.length(); i++) {
            switch (inp.charAt(i)) {
                case "(":
                case "+"", - , *, /, ^"
            }
        }
    }
}
