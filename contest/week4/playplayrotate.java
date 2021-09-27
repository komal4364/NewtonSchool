import java.util.Scanner;

public class playplayrotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        long time = -1;
        int i = -1;
        while (i < N) {
            i++;
            time++;
            if (arr[i] <= time) {
                break;
            }
            if (i == N-1) {
                i = -1;
            }
        }
        System.out.println(i+1);
    }
}
