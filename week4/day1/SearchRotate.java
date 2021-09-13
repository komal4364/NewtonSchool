
public class SearchRotate {
    public static void main(String[] args) {
        int target = 0;
        int []arr = {3, 4, 5, 0 , 1};
        int result = searchTargetInRotateArray(arr, 0, arr.length-1, target);
        if (result != -1) {
            System.out.println("Target is found at index: " + result);
        } else {
            System.out.println("Target is not found");
        }
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //read the length of the array;
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int result = searchTargetInRotateArray(arr, 0, arr.length-1, target);
        if (result != -1) {
            System.out.println("Target is found at index: " + result);
        } else {
            System.out.println("Target is not found");
        }
        in.close();
        */
    }

    // [3, 4, 5, 0, 1]; target: 4;
    // [5, 0, 1, 3, 4]; target: 4
    private static int searchTargetInRotateArray(int []arr, int start, int end, int target) {
        if (start > end) { // C1
            return -1;
        }
        int mid = start + (end - start)/2; // C2
        if (arr[mid] == target) {  // case1: found target element //C3
            return mid;
        } else if (arr[start] <= arr[mid]) {// left half of the array is sorted.
            if (target >= arr[start] && target <= arr[mid]) { // target is present in left half sorted array
                return searchTargetInRotateArray(arr, start, mid-1, target); //C4
            } else { // target is not found in sorted array, so search in non-sorted subarray
                return searchTargetInRotateArray(arr, mid+1, end, target);
            }
        } else { // arr[mid] <= arr[end]; right half of the array is sorted;
            if (target>=arr[mid] && target <= arr[end]) { //target is in sorted array.
                return searchTargetInRotateArray(arr, mid+1, end, target);
            }
            return searchTargetInRotateArray(arr, start, mid-1, target);
        }
    }
}

// C1 + C2 + C3 + C4 => constant work (C) done on every recurrsion;
// s, e 
// s, mid-1
// s, mid`
// log2n