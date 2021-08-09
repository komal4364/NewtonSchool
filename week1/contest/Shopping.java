package contest;

import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []inputs = in.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        String []itemPrices = in.nextLine().split(" ");
        Arrays.sort(itemPrices);
        long result = 0;
        for (int i=2; i<M+2; i++) {
            result = result + Long.parseLong(itemPrices[i]);
        }
        System.out.println(result);
        in.close();
    }
}
