import java.util.Arrays;

public class sortEvenOddPattern {
     public static void main(String[] args) {
        int []arr ={2, 1, 5, 6, 7}; //{7,5,1,2,6}
        partitionOddEvenSort(arr);
        System.out.println(Arrays.toString(arr));
     }
     static void partitionOddEvenSort(int []arr) {
        int l=0, r=arr.length-1, oddCount=0;
        while (l < r) {
            while (arr[l]%2!=0) { //odd numbers
                l++;
                oddCount++;
            }
            while(arr[r]%2==0 && r>l) {
                r--;
            }
            if (r > l) { //swap logic
                 int temp = arr[l];
                 arr[l] = arr[r];
                 arr[r] = temp;
            }
        }
        Arrays.sort(arr, 0, oddCount);
        for(int i=0, j=oddCount-1; i<j;i++,j--) { //reverse odd elements
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        Arrays.sort(arr, oddCount, arr.length);
     }
     
     static void negateOddSort(int []arr) {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] % 2 != 0) { // odd numbers negate
                arr[i] = -arr[i];
             }
         }
         Arrays.sort(arr);
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { // odd numbers negate
               arr[i] = -arr[i];
            }
        }
     }
}
