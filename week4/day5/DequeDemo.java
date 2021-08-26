package day5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        dequeDemo();
        linkedlistdequedemo();
    }
    private static void dequeDemo() {
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
    }
    private static void linkedlistdequedemo() {
        Deque<String> animals = new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
    
        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);
    
        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);
    
        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);
    
        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }
}