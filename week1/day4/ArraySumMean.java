package day4;

public class ArraySumMean {
    public static void main(String[] args) {
        ArraySumDemo();
        int []arr = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(ArraySumRecurDemo(arr, 0, arr.length));
    }
    
    static int ArraySumRecurDemo(int a[], int i, int n) {
            // Last element
            if (i == n-1)
                return a[i];
          
            // When index is 0, divide sum computed so
            // far by n.
            if (i == 0)
                return ((a[i] + ArraySumRecurDemo(a, i+1, n))/n);
          
            // Compute sum
            return (a[i] + ArraySumRecurDemo(a, i+1, n));
    }

    static void ArraySumDemo() {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++)
            sum += arr[i];
    
        System.out.println((double)sum/n);
    }
}
