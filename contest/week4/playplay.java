import java.util.Scanner;

public class playplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        solve(arr, N);
    }
    private static void solve(int []arr, int N) {
        int p = 0;
        for (int i = 0; i < N; i++) {
            long s = 0, e = 1000000000, ans = 1000000000;
            while (s < e) {
                long mid = s + (e - s)/2;
                if (arr[i] <= (mid*N + i)) {
                    e = mid;
                } else {
                    s = mid+1;
                }
            }
            if (s * N + i < ans) {
                ans = s * N + 1;
                p = p +1;
            }
        }
        System.out.println(p);
    }
}
