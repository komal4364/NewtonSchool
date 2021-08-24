package day2;

import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        TwoDDemoDeclaration();
        TwoDDemoDefinition();
        TwoDDemoJaggedArray();
    }
    private static void TwoDDemoDeclaration(){
        System.out.println("*********TwoDDemoDeclaration*********");
        int [][]batchStudentsHeights = new int[2][];
        for (int i = 0; i < batchStudentsHeights.length; i++) {
            batchStudentsHeights[i] = new int[2];
        }
        for (int[] batch : batchStudentsHeights) {
            System.out.println(Arrays.toString(batch));
        }
    }
    

    private static void TwoDDemoDefinition(){
        System.out.println("*********TwoDDemoDefinition*********");
        int [][]batchStudentsHeights = new int[2][];
        for (int i = 0; i < batchStudentsHeights.length; i++) {
            batchStudentsHeights[i] = new int[2];
        }
        batchStudentsHeights[0][0] = 1;
        batchStudentsHeights[0][1] = 2;
        batchStudentsHeights[1][0] = 3;
        batchStudentsHeights[1][1] = 4;
        for (int[] batch : batchStudentsHeights) {
            System.out.println(Arrays.toString(batch));
        }
    }

    private static void TwoDDemoJaggedArray(){
        System.out.println("*********TwoDDemoVariousBatchSizes*********");
        int [][]batchStudentsHeights = new int[2][];
        batchStudentsHeights[0] = new int[2];
        batchStudentsHeights[1] = new int[3];
        batchStudentsHeights[0][0] = 1;
        batchStudentsHeights[0][1] = 2;
        batchStudentsHeights[1][0] = 3;
        batchStudentsHeights[1][1] = 4;
        batchStudentsHeights[1][2] = 14;
        for (int[] batch : batchStudentsHeights) {
            System.out.println(Arrays.toString(batch));
        }
    }
}
