import java.util.Arrays;
import java.util.Scanner;

/*
    input format: how user provides the input for two D matrix.
    M N
    row1 (length of each row would be M)
    row2
    ...
    rowN

    2*3
    input as follows
    2 3 10
    5 6 7
    7 5 6

    [[5, 6, 7], [7, 5, 6]] => array of integers
    array of arrays;
*/
public class twoDimArray {
    private static void print2DMatrix(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {        
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    /*
        3 3 2  (M N Q)
        1 2 3  (arr[0])
        5 6 7  (arr[1])
        8 9 10 (arr[2])
        7      (Query1)
        11     (Query2)
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(); //row
        int N = in.nextInt(); //col
        int Q = in.nextInt(); //queries
        int [][]arr = new int[M][N];
        for (int row = 0; row < M; row++) { //row = 0
            for (int col = 0; col < N; col++) { //col =0, 1, 2, .. N
                arr[row][col] = in.nextInt();
            }
        } 
        int []targets = new int[Q];
        for (int i = 0; i < Q; i++) {
            targets[i] = in.nextInt();
        }
        in.close();
        //print2DMatrix(arr);
        //System.out.println(Arrays.toString(targets));
        for (int q = 0; q < Q; q++) {
            boolean result = findTarget(arr, targets[q]);
            System.out.println(result == true ? "Yes" : "No");
        }
    }
    /*
    1 2 3  (arr[0]) 
    5 6 7  (arr[1])
    8 9 10
    MN > MNLOGN
    */
    private static boolean findTarget(int [][]arr, int target) { //linear search
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
            /*
            Arrays.sort(arr[row]); //sorting every row.
            int idx = Arrays.binarySearch(arr[row], target);
            //System.out.println(target + " " + idx);
            if (idx >= 0) {
                return true;
            }
            */
        }
        return false;
    }
}
