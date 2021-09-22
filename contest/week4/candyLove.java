import java.util.Scanner;

/*
A shop sells candies of sweetness ranging from 1 to 1000000000. 
Price of a candy with sweetness X is A*X + B*f(X) units, where f(X) returns number of digits in the decimal notation of X. 
Given A, B, and T, find the candy with maximum sweetness that Andy can buy if he has T units of money. 
If he cannot buy any candy, print 0.
Input
The first and the only line of input contains three integers A, B and T. 

Constraints: 
1 <= A, B <= 10^9 
1 <= T <= 10^18
Output
Print the maximum sweetness that Andy can buy if he has T units of money. If he cannot buy any candy, print 0.
*/
public class candyLove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long T = in.nextLong();
        in.close();
        long s = 0, e = 1000000000;
        while (e > s) {
            long mid = s + (e - s)/2;
            long sweetness = A*mid + B *(digitLen(mid));
            if (sweetness < T) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }
        System.out.println(s);
    }

    private static int digitLen(long number) {
        int numDigits = 0;
        while (number > 0) {
            number = number/10;
            numDigits++;
        }
        return numDigits;
    }
}
