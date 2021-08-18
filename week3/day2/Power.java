
public class Power {
    public static void main(String[] args) {
        double result = power(2, -2);
        System.out.println(result);
    }

    public static double power(int base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            exponent = -exponent;
            return 1.0/(base * power(base, exponent-1));
        }
        return base * power(base, exponent-1);
    }
}
