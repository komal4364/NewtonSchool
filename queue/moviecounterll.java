import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class moviecounterll {
    LinkedList<String> counterQ = new LinkedList<>();
    public static void main(String[] args) {
        moviecounterll obj = new moviecounterll();
        obj.enqueue("p1");
        obj.enqueue("komal");
        obj.enqueue("bob");
        System.out.println(obj.dequeue() + " " + obj.dequeue() + " " + obj.peek());
        System.out.println(obj.isEmpty() + " " + obj.size());
    }

    //adds the person at the end of the queue.
    public void enqueue(String person) {
        counterQ.addLast(person);
    }

    //remove the element from the queue;
    public String dequeue() {
        return counterQ.removeFirst();
    }

    public boolean isEmpty() {
        return counterQ.isEmpty();
    }
    
    public String peek() {
        return counterQ.get(0);
    }

    public int size() {
        return counterQ.size();
    }
}
