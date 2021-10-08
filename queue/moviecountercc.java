import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class moviecountercc {
    public static void main(String[] args) {
        Queue<String> counterQ = new LinkedList<>();
        counterQ.add("p1");
        counterQ.add("komal");
        counterQ.add("bob");
        Iterator<String> it = counterQ.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(counterQ.poll() + " " + counterQ.poll() + " " + counterQ.peek());
        System.out.println(counterQ.isEmpty() + " " + counterQ.size());
    }
}
