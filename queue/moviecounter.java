import java.util.ArrayList;

class driver {
    public static void main(String[] args) {
        moviecounter obj = new moviecounter();
        obj.enqueue("p1");
        obj.enqueue("komal");
        obj.enqueue("bob");
        System.out.println(obj.dequeue() + " " + obj.dequeue() + " " + obj.peek());
        System.out.println(obj.isEmpty() + " " + obj.size());
    }
}
//ADT - this datastructure has some behaviours.

public class moviecounter {
    ArrayList<String> counterQ = new ArrayList<>();
    //add elements to the queue
    public void enqueue(String person) {
        counterQ.add(person);
    }

    //remove element from the queue (from the head of the queue)
    public String dequeue() {
        return counterQ.remove(0); //position 0 in the array will be removed.
    }

    public boolean isEmpty() {
        return counterQ.isEmpty();
    }

    //read the value at the head of the queue;
    public String peek() {
        return counterQ.get(0);
    }

    //returns the size of the queue;
    public int size() {
        return counterQ.size();
    }
}
