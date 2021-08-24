package day3;

import java.util.Arrays;

/*
A prefix is a collection of characters at the beginning of a string. 
For instance, “mi” is a prefix of “mint” and the longest common prefix 
between “mint”, “mini”, and “mineral” is “min”.
*/
public class longestcommonprefix {
    public static void main(String[] args) {
        String []input = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }
    
    private static String longestCommonPrefix(String []inp) {
        Arrays.sort(inp);
        if (inp.length == 0) {
            return "";
        } else if (inp.length == 1) {
            return inp[0];
        }
        String firstWord = inp[0], lastWord = inp[inp.length-1];
        int i=0,j=0;
        while(i<firstWord.length() && j<lastWord.length()) {
            if (firstWord.charAt(i) == lastWord.charAt(j)) {
                i=i+1;
                j=j+1;
            } else {
                break;
            }
        }
        return firstWord.substring(0, i);
    }
}
