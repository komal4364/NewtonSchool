import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(10); // nums = []; capacity=3, size = 0;
        nums.add(1); // nums =[1]; capacity=3; size =1;
        nums.add(2); // nums = [1,2]; capacity=3; size=2;
        nums.add(1, 10); //update nums = [1, 10, 2] // it's add call, add is inserting in between
        nums.add(2, 50);
        nums.set(1, 5); //[1, 5, 50, 2,_ , _ , _ , _, 9];
        //nums.add(9, 9);
        System.out.println(Arrays.toString(nums.toArray()));
    }
}