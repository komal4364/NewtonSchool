import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/*
Given an Array Arr of N integers. For each i from 1 to N find the index j 
such that Arr[j] >= Arr[i] for multiple possible j find the rightmost j.

Input
First line of input contains a single integer N. 
Second line of input contains N integers, denoting the elements of the array. 

Constraints: 
1 <= N <= 100000 
1 <= Arr[i] <= 1000000000
Output
Print N space separated integers the values of j for each i from 1 to N.
Sample Input:
5
5 2 4 3 1

Sample Output:
1 4 3 4 5

maximimize |j-i| where j > i and arr[j] >= arr[i]; for all i;
*/
class ValIdxPair {
    int value;
    int index;
    //constructors are called when a memory is allocated. no return type for constructor.
    //u can overload a constructor.
    // returntype function_name(arguments); = function signature
    ValIdxPair(int val, int idx) { 
        this.value = val;
        this.index = idx;
    }
}

public class maxrightmost {
    public static void main(String[] args) {
        //Read from the console input - u can use scanner, or a bufferreader class.
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //N elements i want to store;
        //i can take primitive array, vector, arraylist(dynamic arrays);
        // int []arr = new int[N]; => syntax and semantics to declare a array;
        ArrayList<Integer> nums = new ArrayList<Integer>(N); //initially it will allocate some memory
        for (int i = 0; i < N ; i++) {
            nums.add(in.nextInt());
        }
        in.close();
        solve(nums, N); // function call
    }

    private static void solve(ArrayList<Integer> nums, int N) {
        ArrayList<Integer> result = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            result.add(null);
        }
        Vector<ValIdxPair> pairNums = new Vector<ValIdxPair>(); //Pair []pairNums = new Pair[N];
        //[5,2,4,3,1]
        for (int idx = 0; idx < N; idx++) { //i = 0
            int val = nums.get(idx);
            ValIdxPair p = new ValIdxPair(val, idx); // i=0 (5, 0)
            pairNums.add(p);
        }
        //pairnums = [(5, 0), (2, 1), (4, 2), (3, 3), (1, 4)]
        // [5, 2, 4, 3, 1] => [5], [2] => [2, 5], [3,4] => [2, 3, 4, 5 ] (merge sort)
        //sort by value means = > sort by first element in the pair
        //after sorting: [(1, 4), (2, 1), (3,3), (4, 2), (5, 0)]
        //collection that needs sorting, second argumennt is the comparator;
        //comparator - is to decide among two objects which one is greater than or equal to other.
        //lambda function - functional programming style; 
        // the function that take two objects compare them and tell me which is greater.
        //inplace sorting, 
        Collections.sort(pairNums, (p1, p2) -> {
            return p1.value - p2.value; //returns a positive val, p1.value < p2.value; negitive val,
        });
        int max_idx = Integer.MIN_VALUE;
        //[5, 2, 4, 3, 1] => [(1, 4), (2, 1), (3, 3), (4, 2), (5, 0)]
        // i = 0, j = 0 (max(max_idx, idx))
        // (4, 2) -> 
        // [0, 3, 2 , 3 , n]
        for (int i = pairNums.size()-1; i >= 0; i--) { //pairnums collections ()
            int idx = pairNums.get(i).index; // idx = 1
            max_idx = Math.max(max_idx, idx); //max_idx = 3, max(3, 1) => 3;
            result.set(idx, max_idx+1);
        }
        Collections.reverseOrder();
        for (int i = 0; i < N; i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}
