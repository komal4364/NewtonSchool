package StackImpl;

public class StringStack {
    private Node top;
    private int size;
    StringStack() {}
    void Push(String name) {
        Node curr = new Node(name);
        if (this.top == null) {
            this.top = curr;
        } else {
            curr.next = this.top;
            this.top = curr;
        }
        this.size = this.size + 1; //adding a new element;
    }

    String Peek() {
        if (top == null) {
            return null;
        }
        return top.name;
    }

    String Pop() {
        if (top == null) {
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        this.size = this.size - 1;
        return temp.name;
    }

    Boolean IsEmpty() {
        return top == null ? true : false;
    }

    int Size() {
        return this.size;
    }
}
