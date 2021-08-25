package day5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(14);
        numbers.add(22);
        numbers.add(19);
        numbers.add(31);
        System.out.println("PriorityQueue: " + numbers);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}