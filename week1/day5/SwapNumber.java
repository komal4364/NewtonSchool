package day5;

import java.util.*; // contains Collections framework

class SwapNumber {
	public static void main (String[] args) {
                      // Your code here
		Scanner in = new Scanner(System.in);
		int arraySize = Integer.parseInt(in.nextLine());
		String []arr = in.nextLine().split(" ");
		int []input = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			input[i] = Integer.parseInt(arr[i]);
		}
        for(int i =0; i<arr.length; i++) {
            input[i] += (input[input[i]] % arraySize) * arraySize;
        }
		for(int i = 0; i < arraySize; i++) {
			input[i] = input[i]/arr.length;
		}
        System.out.println(Arrays.toString(input));
		in.close();
	}
}
