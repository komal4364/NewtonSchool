package day1;
public class IntegerSquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(11));
    }
    private static int squareRoot(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int start=0, end=n, result=0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            int temp = mid*mid;
            if (temp == n) {
                return mid;
            } else if (temp < n) {
                start = mid+1;
                result = mid;
            } else {
                end=mid-1;
            }
        }
        return result;
    } 
}
