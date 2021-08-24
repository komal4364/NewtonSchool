package day1;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {25, 2, 3, 22, 1};
        Arrays.sort(arr);
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
        }
    }
}
