package revision;

import java.util.Arrays;

public class reverseCharArray {
    public static void main(String[] args) {
        char []inp = "komal".toCharArray();
        reverseCharArr(inp, 0, inp.length-1);
        System.out.println(Arrays.toString(inp));
    }
    static void reverseCharArr(char []inp, int s, int e) {
        if (s > e) {
            return;
        }
        swap(inp, s, e);
        reverseCharArr(inp, s+1, e-1);
    }
    static void swap(char []inp, int i, int j) {
        char temp = inp[i];
        inp[i] = inp[j];
        inp[j] = temp;
    }
}
