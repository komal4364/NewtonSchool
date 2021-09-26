import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
A prefix is a collection of characters at the beginning of a string. 
For instance, “mi” is a prefix of “mint” and the longest common prefix 
between “mint”, “mini”, and “mineral” is “min”.
*/
public class longestcommonprefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> inp = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            inp.add(in.next());
        }
        in.close();
        System.out.println(longestCommonPrefix(inp));
    }
    
    private static String longestCommonPrefix(ArrayList<String> inp) {
        Collections.sort(inp);
        if (inp.size() == 0) {
            return "";
        } else if (inp.size() == 1) {
            return inp.get(0);
        }
        String firstWord = inp.get(0), lastWord = inp.get(inp.size()-1);
        int i=0,j=0;
        while(i<firstWord.length() && j<lastWord.length()) {
            if (firstWord.charAt(i) == lastWord.charAt(j)) {
                i=i+1;
                j=j+1;
            } else {
                break;
            }
        }
        String resp = firstWord.substring(0, i);
        return resp.equals("") ? "-1" : resp;
    }
}
