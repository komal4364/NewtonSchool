import java.util.Comparator;
import java.util.Vector;

public class PairSort {
    public static void main(String[] args) {
        Vector<Pair> nums = new Vector<Pair>();
        nums.add(new Pair(1, 2));
        nums.add(new Pair(3,4));
        nums.add(new Pair(5, 6));
        nums.add(new Pair(7, 8));
        nums.sort(new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.key - o1.key;
            }
        });
        for (Pair pair : nums) {
            System.out.println((pair.key + " " + pair.value));
        }
        
    }
}
