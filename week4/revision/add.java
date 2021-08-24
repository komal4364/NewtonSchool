package revision;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int result = addIntegers(a, b);
        System.out.println(result); 
    }
    static int addIntegers(int a, int b) {
        int result =  _addHelper(a, b);
        return result;
    }
    static int _addHelper(int a, int b) {
        int resp = a + b;
        return resp;
    }
}