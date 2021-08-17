package contest;

import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) { //two lines to read
        Scanner in = new Scanner(System.in); //scanner initialization
        String []inputs = in.nextLine().split(",");// [5,2]
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        String []itemPrices = in.nextLine().split(" "); //prices of the items are read.
        long []prices = new long[itemPrices.length];
        for (int i=0;i<prices.length; i++) { //N
            prices[i] = Long.parseLong(itemPrices[i]);
        }
        Arrays.sort(prices); //sorting NLogN
        long result = 0;
        for (int i=2; i<K+2; i++) { //Ktimes
            result = result + prices[i];
        }
        System.out.println(result);
        in.close();

        //Time Complexity: O(N+NLogN+K) < O(NLogN+2N)=> O(N*(2+LOGN)) => O(NLOGN)
    }
}
