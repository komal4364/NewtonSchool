import java.util.Scanner;

public class weirdseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        long power = 7;
        long sevenMulitple = 0;
        for (int i = 1; i <= N; i++) {
            sevenMulitple += power;
            if ((sevenMulitple = sevenMulitple % N) == 0) {
                System.out.println(i);
                return;
            }
            power *= 10;
            power = power % N;
        }
        System.out.println("-1");
    }
}
