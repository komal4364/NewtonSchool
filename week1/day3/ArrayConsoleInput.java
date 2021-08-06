package day3;

import java.util.Scanner;

public class ArrayConsoleInput {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
        System.out.print("Enter input: ");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        System.out.print("Enter input integer: ");
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
 
        System.out.print("Enter input float number: ");
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
       
          // closing scanner
          in.close();
    }
}
