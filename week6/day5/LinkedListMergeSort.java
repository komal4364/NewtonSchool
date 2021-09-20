package day5;

public class LinkedListMergeSort {
    /*
    public static Node Merge (Node head1, Node head2) {
        Node nHead = head1.val >= head2.val ? head2 : head1;
        Node last = nHead;
        if (nHead == head1) {
            head1 = head1.next;
        } else {
            head2 = head2.next;
        }
        last.next = null;

        while (head1 != null && head2 != null) {
            Node temp = head1.val >= head2.val ? head2 : head1;
            last.next = temp;
            last = last.next;
            if (last == head1) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
            last.next = null;
        }
        if (head1 != null) {
            last.next = head1;
        } else {
            last.next = head2;
        }
        return nHead;
    }
    */
}