import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class dequeue {
    public static void main(String[] args) {
        //0, 1, 2
        Deque<Integer> obj = new LinkedList<>();
        obj.addFirst(1);
        obj.addLast(2);
        obj.addFirst(0);
        System.out.println(obj.removeLast() + " " +obj.removeFirst() + " " + obj.peekFirst() + " " +obj.peekLast());

    }
}
