import java.util.ArrayList;

public class windowmax {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        solve(arr, arr.length, 2); //2, 3, 4, 5
    }
    private static int max(int []arr, int s, int e) {
        int result = arr[s];
        for (int i=s+1; i < e; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    private static void solve(int []arr, int N, int K) {
        if (K >= N) {
            System.out.println(max(arr, 0, N));
        }
        //ws = window start;
        for (int ws = 0; ws < N-K+1; ws++) {
            int we = ws+K-1;
            System.out.println(max(arr, ws, we+1));
        }
    }
}
