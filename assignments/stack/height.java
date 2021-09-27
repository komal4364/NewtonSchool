import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class height {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> people = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            people.add(in.nextInt());
        }
        in.close();
        solve(people, N);
    }

    private static void solve(ArrayList<Integer> people, int N) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < N; i++) {
            int val = people.get(i);
            while (stk.isEmpty() != true) {
                if (stk.peek() < val) {
                    break;
                }
                stk.pop();
            }
            if (stk.isEmpty()) {
                System.out.print("-1 ");
            } else  {
                System.out.print(stk.peek() + " ");
            }
            stk.add(val);
        }
        System.out.println();
    }
}