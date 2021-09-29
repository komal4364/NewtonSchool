import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1); //head -> 1;
        head.add(2); //head -> 1->2;
        head.add(3);
        head.add(4); // 1->2->3->4; reverse this 4->3->2->1;
        //creation of the original linked is done here;
        //create a new linked list for storing the reversal of the original linked list;
        LinkedList<Integer> nHead = new LinkedList<Integer>(); //no elements in the new linked list; 
        //iterate over the original linked list and remove 
        while (head.size() > 0) { //iterating over the linked list head;
            nHead.addFirst(head.element()); // reads the val of the object at the head;
            head.removeFirst();
        }
        
        for (Integer val : nHead) {
            System.out.print(val + "->");
        }
        System.out.println();
    }
}
