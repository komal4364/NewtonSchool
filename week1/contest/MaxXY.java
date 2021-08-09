package contest;

import java.util.Scanner;

public class MaxXY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []inputs = in.nextLine().split(" ");
        long x1 = Long.parseLong(inputs[0]);
        long y1 = Long.parseLong(inputs[1]);
        long x2 = Long.parseLong(inputs[2]);
        long y2 = Long.parseLong(inputs[3]);
        long pair1 = x1*x2;
        long pair2 = x1*y2;
        long pair3 = y1*x2;
        long pair4 = y1*y2;
        long res1 = Math.max(pair1, pair2);
        long res2 = Math.max(pair3, pair4);
        System.out.println(Math.max(res1, res2));
        in.close();
    }
}
