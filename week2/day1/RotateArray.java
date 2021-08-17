import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int []arr = {2, 3, 4, 5};
        RotateArrayKTimes(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
    static void RotateArrayKTimes(int []arr, int k) {
        while (k > 0) { // for (int i = 0; i<k;i--) {}
            RotateArrayByOneUnitToRight(arr);
            k--;
        }
    }
    static void RotateArrayByOneUnitToRight(int []arr) {
        int n = arr.length-1;
        int temp = arr[n];
        int i = n;
        for (; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = temp;
    }
}
