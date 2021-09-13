import java.util.*;

public class PairSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int targetSum = in.nextInt();
        //int []arr = new int[N];
        Vector<Integer> arr = new Vector<>(N);
        for (int i = 0; i < N; i++) {
            arr.add(in.nextInt());
        }
        in.close();
        boolean pairFound = false;
        for (int i = 0; i < N; i++) { //to iterate from 0 to N-1;
            for (int j = i+1; j < N; j++) { // to iterate from 1 to N-1;
                Integer elem1 = arr.get(i);
                Integer elem2 = arr.get(j);
                if (elem1+ elem2 == targetSum) {
                    pairFound = true;
                    break;
                }
            }
        }
        if (pairFound) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}