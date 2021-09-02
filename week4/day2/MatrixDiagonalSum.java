
/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and
all the elements on the secondary diagonal that are not part of the 
primary diagonal.
Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
*/
class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][]ex1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]ex2 = {{5}};
        int [][]ex3 = {{1, 1}, {1,1}};
        int res1 = diagonalSum(ex1);
        int res2 = diagonalSum(ex2);
        int res3 = diagonalSum(ex3);
        System.out.println(res1 + " " + res2 + " " +res3);
    }
    public static int diagonalSum(int[][] mat) {
        int primaryDiagSum = 0;
        int secondaryDiagSum = 0;
        int i=0,j=0,n=mat.length;
        while (i < n && j < n) {
            primaryDiagSum = primaryDiagSum + mat[i][j];
            i=i+1;
            j=j+1;
        }
        i=0; j=n-1;
        while (i<n && j>-1) {
            secondaryDiagSum = secondaryDiagSum + mat[i][j];
            i=i+1;
            j=j-1;
        }
        if (n%2 == 0) {
            return primaryDiagSum + secondaryDiagSum;
        }
        return primaryDiagSum + secondaryDiagSum - mat[n/2][n/2];
    }
}