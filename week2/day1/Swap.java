import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int []arr = {2, 1, 5, 3};
        System.out.println("Before Swap: " + Arrays.toString(arr));
        swap(arr, 0, 1);
        swap(arr, 2, 3);
        System.out.println("After Swap: " + Arrays.toString(arr));
        String []strArr = {"world", "hello"};
        swapString(strArr, 0, 1);
        System.out.println("After String Swap: " + Arrays.toString(strArr));
    }

    private static void swapString(String []arr, int i, int j) { //(Constant operation)
        String temp = arr[i]; //c1
        arr[i] = arr[j]; //c2
        arr[j] = temp; //c3 
    }

    //modular function;
    private static void swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
