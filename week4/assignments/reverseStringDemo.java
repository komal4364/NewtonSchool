import java.util.Scanner;

/*
    Algorithm1:
    1. Read the input from the user using scanner.
    2. Reverse the input string.
    3. Trim the prefix 
*/
public class reverseStringDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder input = new StringBuilder(in.nextLine()); //step1
        input = input.reverse(); //step2
        //00001204
        int nonZeroFirstChar = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0') {
                break;
            }
            nonZeroFirstChar++;
        }

        System.out.println(input.substring(nonZeroFirstChar+1));
        in.close();
    }
}