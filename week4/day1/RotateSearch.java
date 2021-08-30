public class RotateSearch {
    public static void main(String[] args) {
        int arr[] = { 6,5,4,3,2,1 }; 
        int n = arr.length;
        int key = 3;
        //int i = search(arr, 0, n - 1, key);
        int i = searchIter(arr, 0, n-1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }
    static int searchIter(int []nums, int start, int end, int target) {
        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                return mid;
            }

            if(nums[start] <= nums[mid]) { // left array is sorted
                if(target >= nums[start] && target < nums[mid]) { // target lies between start and mid index
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if (nums[end] >= nums[mid]) { // right array is sorted
                if(target >= nums[mid] && target <= nums[end]) { // target lies between mid and end index
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        /* If arr[l...mid] first subarray is sorted */
        if (arr[l] <= arr[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return search(arr, mid + 1, h, key);
        }
 
        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarry*/
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
 
        return search(arr, l, mid - 1, key);
    }
}
