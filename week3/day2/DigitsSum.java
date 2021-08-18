public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(DigitSumDemo(101));
    }

    static long DigitSumDemo(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + DigitSumDemo(n/10);
    }
}
