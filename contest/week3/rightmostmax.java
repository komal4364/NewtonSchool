import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class SortByValue implements Comparator<ValueIndexPair> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(ValueIndexPair a, ValueIndexPair b)
    {
        return a.value - b.value;
    }
}

class ValueIndexPair {
    Integer value;
    Integer index;
    ValueIndexPair(Integer val, Integer idx) {
        value = val;
        index = idx;
    }
}

// don't change the name of this class
// you can add inner classes if needed
public class rightmostmax {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        
        //read array input of integers from the user
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        int []result = maxDistance(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
	}
     private static int[] maxDistance(int []arr) {
        int []result = new int[arr.length];
        ValueIndexPair []pairs = new ValueIndexPair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new ValueIndexPair(arr[i], i);
        }
        Arrays.sort(pairs, new SortByValue()); 
        int max = Integer.MIN_VALUE;
        for (int i=arr.length-1; i>= 0; i--) {
            max = Math.max(max, pairs[i].index);
            result[pairs[i].index] = max+1;
        }
        return result;
    } 
}