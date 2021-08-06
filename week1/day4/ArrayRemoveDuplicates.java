package day4;

import java.util.Arrays;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
        int []input = new int[args.length];
        for (int i = 0; i<args.length; i++) {
            input[i] = Integer.parseInt(args[i]);
        }
        removeDuplicates(input);
    }
    public static boolean isElementExist(int []outputArray, int elem) {
        for (int outputElem : outputArray) { //[10,20,30] 0, 1,2 ; 10,20,30 
            //outputElem = outputArray[i]
            if (outputElem == elem) {
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicates(int []array) {
        int []outputArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (isElementExist(outputArray, elem) == false) {
                outputArray[j] = elem;
                j = j+1;
            } 
        }
        System.out.println(
            Arrays.toString(Arrays.copyOfRange(outputArray, 0, j)));
    }
}
