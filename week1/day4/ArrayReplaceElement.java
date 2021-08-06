package day4;

public class ArrayReplaceElement {
    public static void main(String[] args) {
        ReplaceElement();
    }
    static void ReplaceElement() {
        int arr[] = { 5, 1, 3, 2, 4 } ;
        int n = arr.length ;
        // Update array
        for (int i = 0; i <= n - 2; i++)
            arr[i] = arr[i + 1];

        // Change the last element to -1
        arr[n - 1] = -1;

        // Print the updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
