import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
standard input/output: 2s/128000 kB

Given an array of N integers, give the number with maximum frequency. If multiple numbers have maximum frequency print the maximum number among them.
Input
The first line of the input contains an integer N, Second lines contains N space seperated integers of array. 

Constraints 
3 <= N <= 1000 
1 <= Arr[i] <= 100
Output
The output should contain single integer, the number with maximum frequency.If multiple numbers have maximum frequency print the maximum number among them.
*/
public class MaxFreq {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            int key = in.nextInt();
            if (freq.containsKey(key)) {
                int val = freq.get(key);
                freq.put(key, val+1);
            } else {
                freq.put(key, 1);
            }
            n--;
        }
        in.close();
        Vector<Pair> nums = new Vector<>();
        for (Map.Entry<Integer,Integer> elem: freq.entrySet()) {
            nums.add(new Pair(elem.getKey(), elem.getValue()));
        }
        nums.sort(new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.value == o2.value) { //equal
                    return o2.key - o1.key;
                }
                return o2.value - o1.value;
            }
        });
        System.out.println(nums.get(0).key);
    }
}
