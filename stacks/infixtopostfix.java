import java.util.Stack;

//build a function or set of functions, which takes the infix expression 
// and convert it to postfix
public class infixtopostfix {
    public static void main(String[] args) {
        String inp = "[ ( ( { A + B } * C )/D-(e^3))]"; //input string doesn't have spaces.
        String result = solve(inp);
        System.out.println(result);
    }
    /*
        1. if we encounter an opening bracket, then push it to stack.
        2. if we encounter an operand, then push it to stack.
    */
    private static String solve(String inp) { //inp - a infix expression. (A*B)-C+D/E (AB*C-DE/+)
        Stack<Character> stk = new Stack<>();
        String postfix = "";
        //if we find an operand i.e A, B then we push it to output.
        //if the character is an operator, then if stack is empty, 
        //if stack is not empty; apply precedence;
        // if top of stack has high precedence than the incoming character, the pop till top the stack is 
        // having lower precendence or the stack is empty.
        // if top of the stack has lower precedence then push it to top of the stack.
        for (int i = 0; i < inp.length(); i++) {
            Character ch = inp.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            }
            if (ch == '(') {
                stk.push(ch);
            } else if (Character.isLetter(ch) || Character.isDigit(ch)) { // adding only a letter,
                postfix += ch;
            } else { //everthing is an operator. *, /, +, -, %, ^
                if (stk.isEmpty()) {
                    stk.push(ch);
                } else {
                    //pop till we find '(';
                    if (isClosedParanthesis(ch)) { //is it opening paranthesis; ispairparthesis -false
                        while (!stk.isEmpty() && !isPairParanthesis(stk.peek() ,ch)) {
                            postfix += stk.pop();
                        }
                        stk.pop();
                        continue;
                    }

                    //if stack is not empty and top of the stack is having higher > ch, then pop and add to postfix;
                    while (!stk.isEmpty() && stk.peek() != '(' && isCharhasHigherPrecendence(stk.peek(), ch)) { // top of the stack has higher precendence
                        postfix += stk.pop();
                    }
                    stk.push(ch); 
                }
            }
        }
        while (!stk.isEmpty()) {
            postfix += stk.pop();
        }
        return postfix;
    }

    private static boolean isPairParanthesis(Character open, Character closed) {
        if (open == '(' && closed ==')') {
            return true;
        } else if (open == '{' && closed == '}') {
            return true;
        } else if (open =='[' && closed == ']') {
            return true;
        }
        return false;
    }

    private static boolean isClosedParanthesis(Character ch) {
        return (ch == ')' || ch == '}' || ch == ']') ? true : false;
    }
    //ts - is the top of the stack.
    //ts >= ch ; pop else push
    private static int getIntMapping(Character ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }

    private static boolean isCharhasHigherPrecendence(Character ts, Character ch) {
        return getIntMapping(ts) >= getIntMapping(ch);
    }
}
