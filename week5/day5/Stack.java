package week5.day5;

public class Stack {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        try {
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
            return;
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
    static final int MAX_SIZE = 4;
    Integer []stack;
    int head = 0;
    Stack(int size) {
        if (size >= MAX_SIZE)
            size = MAX_SIZE;
        stack = new Integer[size];
    }
    public void push(Integer val) throws Exception {
        if (this.head == MAX_SIZE)
            throw new Exception("MAX Size Reached");
        this.stack[this.head] = val;
        this.head = head + 1;
    }
    public Integer peek() throws Exception {
        if (this.head == 0)
            throw new Exception("stack is empty");
            
        return this.stack[this.head];
    }

    public Integer pop() throws Exception {
        if (this.head == 0)
            throw new Exception("stack is empty");
        return this.stack[--this.head];
    }
}
