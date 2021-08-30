public class BinarySearchDuplicatesFreq {
    public static void main(String[] args) {
        int []arr = {1,2,2,2,2,2,2,2, 3,3,5};
        int target = 2;
        int result = searchDupFreq(arr, 0, arr.length-1, target);
        System.out.println("Frequency of target: " + target + " = " + result);
    }

    private static int searchDupFreq(int []arr, int s, int e, int target) {
        /*
            step1: finding first position of the target.
            step2: finding last position of the target;
            step3: return last pos - first pos + 1;
        */
        int sp = searchFirstTargetPos(arr, s, e, target);
        if (sp == -1) {
            return 0;
        }
        int ep = searchLastTargetPos(arr, s, e, target);
        if (ep == -1) {
            return 0;
        }
        return ep-sp+1;
    }

    private static int searchLastTargetPos(int []arr, int s, int e, int target) {
        int lastTargetPosition = -1;

        while (s<=e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                s = mid+1;
                lastTargetPosition = mid;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else { // target > arr[mid]
                s = mid+1;
            }
        }
        return lastTargetPosition;
    }

    private static int searchFirstTargetPos(int []arr, int s, int e, int target) {
        int firstTargetPosition = -1;

        while (s<=e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                firstTargetPosition = mid;
                e = mid-1;
                //return mid;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else { //arr[mid] < target
                s = mid+1;
            }
        }
        return firstTargetPosition;
    }
}
