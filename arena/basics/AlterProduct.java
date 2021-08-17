import java.util.Scanner;

/*
standard input/output: 2s/128000 kB
Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places. 
Note:- Consider the first element to start from 1.
Input: The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array. 

Constraints:- 
1 <= N <= 50 
1 <= Arr[i] <= 5
Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.
*/
public class AlterProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long N = Long.parseLong(in.nextLine());
        String []inp =  in.nextLine().split(" ");
        Long []arr = new Long[inp.length];
        for (int i = 0; i < inp.length; i++) {
            arr[i] = Long.parseLong(inp[i]);
        }
        sumProduct(arr);
        in.close();
    }

    private static void sumProduct(Long []arr) {
        long sum = 0, product = 1;
        for (int i = 1; i <= arr.length; i++) {
            if (i%2 == 0) { // even case
                sum = sum + arr[i-1];
            } else { // odd even
                product = product * arr[i-1];
            }
        }
        System.out.println("sum: " + sum + " product: " + product);
    }
}
