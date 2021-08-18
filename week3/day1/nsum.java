public class nsum {
    public static void main(String[] args) {
        int []arr = {2, 1, 5, 7, 4, 3, 6, 9, 8, 10};
        System.out.println("recursion:"+ sumArray(arr, 0, arr.length-1));
        System.out.println("partition:" + sumArrayTwoPartitions(arr, 0, arr.length-1));
    }
    /*
        SA - (0, 9)
            2 + SA - (1, 9)
                2+1+SA - (2, 9)
                    SA- (3, 9)
                            SA(7,9) - arr[7] + SA(8,9) -> 9 + 18 -> 27
                            SA(8,9) - arr[8] + SA(9,9)-10 -> 8+10 - 18
                        .... SA -(9, 9) - 10
    */
    static int sumArray(int []arr, int startIdx, int endIdx) {//startIdx - endIdx
        if (startIdx == endIdx) { //base case or a terminating 
            return arr[endIdx]; //return 10; there is only one element in the array.
        }
        return arr[startIdx] + sumArray(arr, startIdx+1, endIdx);
    }

    static int sumArrayTwoPartitions(int []arr, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return 0;
        }
        if (startIdx == endIdx) {
            return arr[startIdx];
        }
        int mid = startIdx+(endIdx-startIdx)/2; //endIndx+startIdx/2;
        return sumArrayTwoPartitions(arr, startIdx, mid) + sumArrayTwoPartitions(arr, mid+1, endIdx);
    }
}
