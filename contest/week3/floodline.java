import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class floodline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums.add(in.nextInt());
        }
        in.close();
        Collections.sort(nums);
        long currHappiness = 0;
        int result = 0;
        for (int i = 0; i < N ; i++) {
            if (currHappiness <= nums.get(i)) {
                currHappiness = currHappiness + nums.get(i);
                result++;
            }
        }
        System.out.println(result);
    }
}
