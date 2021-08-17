import java.util.Arrays;

/*
Programming: Tools
Resources: Storage and Compute
Eg: Phone Storage(RAM, SD), Compute(Processor)

When should we worry about these resources?
- large input that doesn't fit in memory?
- instructions that take lot of time

Programs that takes long time to run or more storage are least preferrable.
How do we measure/represent the resource utilization for a given program/algorithm?
- can we capture the amount of bytes used and amout of time it took to run a program?
- we need a way to generalize the concept of resource utilization.

What is the varying/changing in a given program/algorithm that affects the resources
utilization?
- input size

A valid algorithm that solves the given problem using less resources is considered 
as an optimal algorithm.

Let's say, T(n) defines the time complexity of an algorithm
Eg: 
- T(n) = n^3 + n^2 + n + 1; 
- T(n) = 2^n + n^3 + n + 1;
- T(n) = nlog2n + n;

eg: Sum of n natural numbers;
sum = 0;
for (int i = 0; i < n; ++i)
    sum = sum + i; // this statement is executed n time?;
the compute cost to run sum = sum + i is let's say C (some constant);
The algorithm cost of summing n numbers is "nc" i.e T(n) = cn;

The algorithm response to an input of size n is denoted as Order of Growth and represented 
as O(n); where is termed as Big-O and n is the input size.

Big O Notation expresses the run time of an algorithm in terms of how quickly it grows relative to 
the input ‘n’ by defining the N number of operations that are done on it. 
Thus, the time complexity of an algorithm is denoted by the combination of all O[n] assigned 
for each line of function.

Prominent Time Complexities: (order of desired to worst)
Constant - O(1)
Log: O(log n)
Linear - O(n)
LinearArithmic - O(n log n) //sorting algorithms
Quadratic: O(n^2)
Cubic: O(n^3)
Exponential: O(c^n) - finding all subsets
Factorial: O(n!) - finding all permutations of a given set/string;

*/
public class TimeComplexity {
    public static void main(String[] args) {
        ConstantDemo();
        LogDemo();
        LinearDemo();
        QuadraticDemo();
        CubicDemo();
    }
    static void ConstantDemo() {
        int a = 10;
        a++;
        a = a-1;
        a = 2*10;
        a = a/20;
        int arr[] = {1, 2, 4};
        arr[0] = a; //c
        System.out.println(arr[2]);
    }
    static void LogDemo() {
        int []arr = {1, 2, 5, 7, 8, 9, 10};
        int start = 0, end = arr.length, target = -1;
        while (end >= start) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                System.out.println("found target " + target + " at " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println("Target Not Found");
    };

    static void LinearDemo() {
        int []arr = {2, 1, 7, 5, -10, 20};
        int min = Integer.MAX_VALUE;
        for (int elem : arr) {
            if (elem < min)
                min = elem;
        }
        System.out.println(min);
    }

    static void LinearithmicDemo() {
        int []arr = {2, 1, 7, 5, -10, 20};
        Arrays.sort(arr); //O(nlogn)
        System.out.println(arr);
    }

    static void QuadraticDemo() {
        //check if the input has any duplicates
        int []arr = {2, 1, 5, 7, 9, 10, 10}; //O(N^2)
        for (int i=0; i < arr.length; ++i) { //N
            for (int j=i+1; j < arr.length; ++j) { //N
                if (arr[i] == arr[j]) { //in worst case, this is always false: C
                    System.out.println("Duplicate Found  " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("Duplicate Not Found");
    }
    static void CubicDemo() {
        //find values to a given equation 3x+9y+8z = 79; x, y, z < n
        int n = 10;
        for (int i=0; i < n; ++i) {
            for (int j=0; j<n; ++j) {
                for (int k = 0; k<n; ++k) {
                    if (3*i + 9*j + 8*k == 79) {
                        System.out.printf("Solved x:%d; y:%d; z:%d; ", i, j, k);
                        System.out.println();
                    }
                }
            }
        }
        System.out.println();
    }
}
