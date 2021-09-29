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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}