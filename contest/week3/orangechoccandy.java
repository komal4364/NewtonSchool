import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class orangechoccandy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt(), Y= in.nextInt();
        int A = in.nextInt(), B = in.nextInt();
        int C = in.nextInt();
        Integer []choclateHp = new Integer[A];
        Integer []orangeHp = new Integer[B];
        Integer []unknownHp = new Integer[C];
        for (int i = 0; i < A; i++) {
            choclateHp[i] = in.nextInt();
        }
        for (int i = 0; i < B; i++) {
            orangeHp[i] = in.nextInt();
        }
        for (int i = 0; i < C; i++) {
            unknownHp[i] = in.nextInt();
        }
        in.close();
        long result =  computeHappiness(choclateHp, orangeHp, unknownHp, X, Y, C);
        System.out.println(result);
    }

    private static long computeHappiness(Integer []choc, Integer []oran, 
        Integer []unk, int X, int Y, int C) {
        Arrays.sort(choc, Collections.reverseOrder());
        Arrays.sort(oran, Collections.reverseOrder());
        Arrays.sort(unk, Collections.reverseOrder());
        Vector<Integer> candies = new Vector<Integer>();
        for (int i = 0; i < X; i++) {
            candies.add(choc[i]);
        }
        for (int i = 0; i < Y; i++) {
            candies.add(oran[i]);
        }
        for (int i = 0; i < C; i++) {
            candies.add(unk[i]);
        }
        Collections.sort(candies, Comparator.reverseOrder());
        long happinness = 0;
        for (int i = 0; i < X + Y; i++) {
            happinness = happinness + candies.get(i);
        }
        return happinness;
    }
}
