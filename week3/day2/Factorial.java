
/*
factorial(5) 
   factorial(4) 
      factorial(3) 
         factorial(2) 
            factorial(1) 
               return 1 
            return 2*1 = 2 
         return 3*2 = 6 
      return 4*6 = 24 
   return 5*24 = 120

Two Steps:
1. Base Case - factorial(1) => 1;
2. Recursive - Reduction step; reduce the problem size;
*/
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(gcd(98, 56));
        System.out.println(power(-2, 3));
    }
    
    static double power(int base, int exponent) {
        if (exponent < 0) {
            return 1.0/power(base, -exponent);
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent-1);
    }

    static long factorial(int n) { 
        if (n == 1) return 1; 
        return n * factorial(n-1); 
    }
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
