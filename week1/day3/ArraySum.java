package day3;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); // space sepearated numbers;
        String []numbers = input.split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum = sum + Integer.parseInt(number);
        }
        System.out.println(sum);
        in.close();
    }
}
