package day1;
public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {25, 2, 3, 22, 1};
        int target = 3;
        for (int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("target:" + target + " found at " + i);
                break;
            }
        }
    }
}
