public class DoubleLinkedList {
    Node head;
    Node tail;
    int len;
    DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.len = 0;
    }
    public void print() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    //Queries
    public int Size() {
        return this.len;
    }

    public void AddNodeAtHead(int data) {
        Node curr = new Node(data);
        if (this.head == null) {
            this.head = curr;
            this.tail = curr;
            this.len = this.len + 1; //pre-processing 
            return;
        }
        curr.next = head;
        head.prev = curr;
        head = curr;
        this.len = this.len + 1;
    }
}