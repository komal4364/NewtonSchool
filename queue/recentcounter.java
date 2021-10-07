import java.util.LinkedList;
import java.util.Queue;

class trigger {
    public static void main(String[] args) {
        recentcounter obj = new recentcounter();
        System.out.println(obj.ping(1) + " " + obj.ping(100) 
        + " " + obj.ping(3001) + " " +obj.ping(3002));
    }
}

public class recentcounter {
    Queue<Integer> events;
    public recentcounter() {
        events = new LinkedList<Integer>();
    }
    
    //t = 3002; poll is a dequeue
    public int ping(int t) {
        events.add(t);
        int start = t-3000; //2, [1, 100, 3001, 3002];
        while (events.peek() < start) {
            events.poll();
        }
        return events.size();
    }
}
