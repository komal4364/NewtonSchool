public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {25, 2, 3, 22, 1};
        /*
        //Arrays.sort(arr);
        int start=0, end=arr.length-1, target = 3;
        while(end > start) {
            int mid= start +(end-start)/2;
            if (arr[mid] ==  target) {
                System.out.println("target:" + target + " found at " + mid);
                break;
            } else if (arr[mid] <  target) {
                start = start+1;
            } else {
                end = mid-1;
            }
        }*/
        int result = binarySearchRecursion(arr, 0, arr.length-1, 22);
        System.out.println(result);
    }

    private static int binarySearchRecursion(int []arr, int s, int e, int target) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, s, mid-1, target);
        } else {
            return binarySearch(arr, mid+1, e, target);
        }
    }

    private static int binarySearch(int []arr, int s, int e, int target) {
        while(s<=e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else { //arr[mid] < target
                s = mid+1;
            }
        }
        return -1;
    }

}
