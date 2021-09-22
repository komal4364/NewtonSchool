import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
    You're given a string S of lowercase letters of the english alphabet. 
    Find whether you can choose some characters of the string S in any order to create the string "red".
    Input
    The first and the only line of input contains the string S. 

    Constraints 
    1 <= |S| <= 100 
    All the characters in S are lowercase letters of the english alphabet.
    Output
    Output "Yes" (without quotes) if you can create the string "red", else output "No" (without quotes).
*/
public class red {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        in.close();
        Set<Character> elems = new HashSet<Character>();
        for (int i = 0; i < inp.length(); i++) {
            elems.add(inp.charAt(i));
        }
        if (elems.contains('r') && elems.contains('e') && elems.contains('d')) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
