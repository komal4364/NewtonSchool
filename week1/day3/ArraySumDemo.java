package day3;

import java.util.Scanner;

public class ArraySumDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfInputArray = Integer.parseInt(in.nextLine());
        System.out.println("Enter array of integers seperated by space:");
        String input = in.nextLine();
        System.out.println(input);
        String []nums = input.split(";"); // "10 20 30".split(" ") ->["10", "20", "30"]
        int totalSum = 0;
        for(int i = 0; i < sizeOfInputArray; i++) {
            totalSum = totalSum + Integer.parseInt(nums[i]);
        }
        System.out.println(totalSum);
        in.close();
    }
}

//Given the size of the array (N) to be considered 
// and given the array of size M (M >= N); print the sum of first
// N elements;
/*
=> 3;
=> 10 20 30 40 50 60 
*/
/*
read two inputs start and end; 3, 5 (0, 10)
read an array of numbers
print sum of elements in the range of (start, end)
*/