package day4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class revisionSet {
    public static void main(String[] args) {
        //ordering in which u inserted it
        Set<Integer> nums = new LinkedHashSet<Integer>(); //this doesn't maintain the order;
        nums.add(2);
        nums.add(8);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(1);
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}