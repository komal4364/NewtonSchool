

public class Fib {
    public static void main(String[] args) {
        System.out.println(FibDemo(9));
    }
    static long FibDemo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return FibDemo(n-1) + FibDemo(n-2);
    }
}
