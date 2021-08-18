import java.util.Arrays;

public class InsertionSort {
     // Driver method
     public static void main(String args[]) {
         int arr[] = { 12, 11, 13, 5, 6 };
         InsertionSort ob = new InsertionSort();
         ob.sort(arr);
         printArray(arr);
     }

      /*Function to sort array using insertion sort*/
      void sort(int arr[]) {
          int n = arr.length;
          for (int i = 1; i < n; ++i) { //n helps to pick an element from the unsorted component.
              int key = arr[i];
              int j = i - 1;
              //12, 11, 10, 9, 8; //
              /* Move elements of arr[0..i-1], that are
                 greater than key, to one position ahead
                 of their current position */
              while (j >= 0 && arr[j] > key) { //n-1
                  arr[j + 1] = arr[j]; //12, 12, 13, 5, 6
                  j = j - 1; // j =-1
              }
              arr[j + 1] = key; // arr[j+1]=arr[0]=11; [11, 12, 13, 5, 6] //Constant C
              //[5,6, 11,12,13]
          }
      }
   
      /* A utility function to print array of size n*/
      static void printArray(int arr[]) {
          int n = arr.length;
          for (int i = 0; i < n; ++i)
              System.out.print(arr[i] + " ");
   
          System.out.println();
      }
   
     
}
