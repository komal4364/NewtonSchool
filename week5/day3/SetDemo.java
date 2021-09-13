import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class SetDemo {
    //obj_val*3 + date;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        Set<Integer> age1 = new HashSet<Integer>(M);
        for (int i = 0; i < M; i++) {
            age1.add(in.nextInt());
        }
        Set<Integer> age2 = new HashSet<Integer>(N);
        for (int i = 0; i < N; i++) {
            age2.add(in.nextInt());
        }
        in.close();
        age1.retainAll(age2);
        int sum = 0;
        Iterator<Integer> it = age1.iterator();
        while (it.hasNext()) {
            int val = it.next();
            sum = sum + val;
            System.out.println(val);
        }
        System.out.println(sum);
    }
}