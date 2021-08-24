public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(DigitSumDemo(101));
    }

    static long DigitSumDemo(int n) {
        if (n == 0) {
            return 0;
        }
        /*
        int result = 0;
        while(n>0) {
            long rem= n%10;
            result = result + rem;
            n = n/10;
        }*/
        return n%10 + DigitSumDemo(n/10);
    }
}
