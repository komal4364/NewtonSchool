package linkedlist;
//Double linked list node;
// Node node = new Node(1); //constructor will be called
public class Node { //datatype like an Integer, String, etc..
    int data;
    Node next; //next reference
    Node prev; //prev reference.
    Node(int data) { //this is the constructor.
        this.data = data; //data = 1;
        this.next = null;
        this.prev = null;
    }
}