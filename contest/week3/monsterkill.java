import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class weaponPair {
    int power;
    int weight;
    weaponPair(int pow, int wei) {
        this.power = pow;
        this.weight = wei;
    }
}

public class monsterkill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), D = in.nextInt(), H = in.nextInt();
        ArrayList<weaponPair> weapons = new ArrayList<weaponPair>(N);
        for (int i = 0; i < N; i++) {
            weapons.add(i, new weaponPair(in.nextInt(), 0));
        }
        for (int i = 0; i < N; i++) {
            weapons.get(i).weight  = in.nextInt();
        }
        in.close();
        Collections.sort(weapons, new Comparator<weaponPair>() {
            @Override
            public int compare(weaponPair h1, weaponPair h2) {
                if (h1.power < h2.power) {
                    return 1;
                } else if (h1.power > h2.power) {
                    return -1;
                }
                return 0;
            }
        });
        Vector<weaponPair> filteredWeapons = new Vector<weaponPair>(N);
        for (weaponPair weapon : weapons) {
            if (weapon.weight > D) {
                continue;
            }
            filteredWeapons.add(weapon);
        }
        int weaponCount = 0;

        while (H > 0 && weaponCount < filteredWeapons.size()) {
            H = H - filteredWeapons.get(weaponCount).power;
            weaponCount++;   
        }

        weaponCount = H <= 0 ? weaponCount : -1;
        System.out.println(weaponCount);
    }
}
