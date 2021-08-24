package day2;

public class MaxSumColumn {
    public static void main(String[] args) {
        int [][]heights = {
            {2, 3},
            {3, 4}
        };
        System.out.println(columnSum(heights));
    }
    private static int columnSum(int [][]heights) {
        int maxSum = Integer.MIN_VALUE;
        int columnSize = heights[0].length, rowSize = heights.length;
        for (int col=0; col<columnSize; col++) {
            int colSum = 0;
            for (int row=0; row<rowSize; row++) {
                colSum = colSum + heights[row][col];
            }
            if (colSum > maxSum) {
                maxSum = colSum;
            }
        }
        return maxSum;
    }
}
