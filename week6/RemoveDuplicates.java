import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
standard input/output: 2s/128000 kB

Given an array Arr of N +1 integers containing N different elements, your task is to print the array without the repeating element in it.
Input
First line of input contains a single integer N, the next line contains N +1 space separated integers containing values of Arr. 

Constraints:- 
1 < = N < = 1000 
1 < = Arr[i] < = 105
Output
Print the array without the duplicate element.
*/
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> nums = new HashSet<>();
        while (n >= 0) {
            int temp = in.nextInt();
            if (nums.contains(temp)) {
                n--;
                continue;
            }
            nums.add(temp);
            System.out.print(temp + " ");
            n--;
        }
        in.close();
        System.out.println();
    }
}
