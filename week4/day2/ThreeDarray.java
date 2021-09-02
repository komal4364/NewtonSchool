

import java.util.Arrays;

public class ThreeDarray {
    public static void main(String[] args) {
        int [][][]threeDarray = new int[1][][];
        threeDarray[0] = new int[1][];
        //threeDarray[1] = new int[1][];
        threeDarray[0][0] = new int[2];
        threeDarray[0][0][0] = 10;
        threeDarray[0][0][1] = 20;
        for (int[][] each : threeDarray) {
            for (int[] each1 : each) {
                System.out.println(Arrays.toString(each1));
            }
        };
    }
}
