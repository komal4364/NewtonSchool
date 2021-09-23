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
        double ans = 1e10;
        for (int i = 0; i < N; i++) {
            double s = 0, e = 2*N;
            while (s < e) {
                double mid = (s+e)/2;
                if (arr[i] <= (mid*N + i)) {
                    e = mid;
                } else {
                    s = mid+1;
                }
            }
            if ((s * N + i) < ans) {
                ans = s * N + 1;
                p = i +1;
            }
        }
        System.out.println(p);
    }
}
