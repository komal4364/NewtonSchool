package linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList ll = new LinkedList(); //head -> null;
        int N = in.nextInt();
        while (N > 0) {
            N--;
            ll.AddNodeAtLast(in.nextInt());
        }
        ll.PrintDLL();
        ll.printReverseDLL();
        in.close();
        //head -> 1<->2<->3<->4<->5->null; //tail -> 5 tail.prev = 4;
        Node curr = ll.head.next.next.next; //it is giving you reference to 4; tail.prev
        ll.DeleteNode(curr);
        ll.PrintDLL(); //1->2->3->5;
    }
}
