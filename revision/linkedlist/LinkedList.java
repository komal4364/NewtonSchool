package linkedlist;

public class LinkedList { //class which has Nodes connected.
    Node head;
    Node tail;
    Integer size;

    //this function is going to add a node to the dll linked list at the end
    void AddNodeAtLast(int data) {
        Node node = new Node(data); //new Node(data) => calls the constructor of Node class;
        //adding a node to an empty linked list.
        if (head == null) {
            head = node;
            tail = node;
            return;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = tail.next; //tail = node;
        }
    }
    //PrintDLL is the function that prints the data in the linked list from head to tail;
    void PrintDLL() {
        Node curr = head; // int val = 2;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printReverseDLL() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println();
    }
    //Delete node pointed by curr in the dll.
    void DeleteNode(Node curr) {
        //if curr.next == null i.e curr == tail;
        //if curr.prev == null ie. curr == head; how do u delete them and udpate head and tail references properly.
        Node t1 = curr.prev;
        Node t2 = curr.next;
        t1.next = t2;
        t2.prev = t1;
        curr.next = null;
        curr.prev = null;
    }
}