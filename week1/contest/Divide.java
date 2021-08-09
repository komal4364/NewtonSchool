package contest;

import java.util.*; // contains Collections framework

public class Divide {
	public static void main (String[] args) {
                      // Your code here
        Scanner in = new Scanner(System.in);
        String []inputs = in.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        if (N%M == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
	}
}
