package assignment;

import java.util.ArrayList;
import java.util.Scanner;


public class NumberOfWays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        int testCase = 1;
        while (numTestCases > 0) {
            int target = Integer.parseInt(in.nextLine()); //N
            int []count = {0}; //variable that stores the output.
            ArrayList<Integer> records = new ArrayList<Integer>(); //i want to store the combination
            numWays(target, 1, count, records);
            System.out.println("testCase " + testCase + "=> result:" + count[0]);
            testCase = testCase+1;
            numTestCases = numTestCases - 1;
        }
        in.close();
    }

    private static void numWays(int target, int val, int []count, ArrayList<Integer> records) {
        if (target == 0) { //Solution condition;
            count[0]=count[0]+1;
            System.out.println(records.toString());
        }
        if (target < 0) {
            return;
        }
        for (int i=val;i<=target;i++) {
            if (i>target) {
                return; //bound condition;
            }
            target = target-i;
            records.add(i);
            numWays(target, i+1, count, records);
            target = target+i;
            int lastIdx = records.size()-1;
            records.remove(lastIdx);
        }
    }
}
