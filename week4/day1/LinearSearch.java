public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {25, 2, 3, 22, 1}; //unsorted;
        int target = 1;
        int result = linearSearchIter(arr, target);
        System.out.println(result);
        boolean elemExists = linearSearchRecu(arr, 0, arr.length-1, target);
        System.out.println(elemExists);
    }

    private static int linearSearchIter(int []arr, int target) {
        for (int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("target:" + target + " found at " + i);
                return i;
            }
        }
        return -1;
    }
  
    /*
    {25, 2, 3, 22, 1}, 13
    ls(0, 4, 13) => ls(1, 4, 13) => ls(2,4,13)=> ls(3, 4, 13)=> ls(4, 4, 13)
    =>ls(5, 4, 13)
    */
    //1. what is the function return type and what are the arguments to the function.
    //2. what is the base case;
    private static boolean linearSearchRecu(int []arr, int start, 
            int end, int target) {
        if (start > end) {
            return false;
        }
        if (arr[start] == target) {
            return true;
        }
        return linearSearchRecu(arr, start+1, end, target);
    }
}
