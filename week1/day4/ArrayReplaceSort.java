package day4;

public class ArrayReplaceSort {
    public static void main(String[] args) {
        System.out.println(MinimumPlacesToChange());    
    }

    static int MinimumPlacesToChange() {
        int arr[] = { 1, 2, 6, 5, 4 };
        int n = arr.length;

        int LIS[] = new int[n];
        int len = 0;
 
        // Mark all elements of LIS as 1
        for (int i = 0; i < n; i++)
            LIS[i] = 1;
 
        // Find LIS of array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && (i-j)<=(arr[i]-arr[j]))
                    LIS[i] = Math.max(LIS[i],
                                 LIS[j] + 1);
            }
            len = Math.max(len, LIS[i]);
        }
 
        // Return min changes for array
        // to strictly increasing
        return n - len;
    }
}
