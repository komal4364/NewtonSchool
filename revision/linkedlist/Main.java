package linkedlist;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<String, Integer>();
        ages.put("komal", 32);
        ages.put("guru", 4);
        ages.put("KOMAL", 33);//duplicates -> "komal" : 33;
        ages.get("komal"); //33;
        for (String key : ages.keySet()) { //iterate over the map
            System.out.println(key + "->" + ages.get(key));
        }
        /*
        Scanner in = new Scanner(System.in);
        LinkedList ll = new LinkedList(); //head -> null;
        int N = in.nextInt();
        while (N > 0) {
            N--;
            ll.AddNodeAtLast(in.nextInt());
        }
        ll.PrintDLL();
        ll.printReverseDLL();
        in.close();
        //head -> 1<->2<->3<->4<->5->null; //tail -> 5 tail.prev = 4;
        Node curr = ll.head.next.next.next; //it is giving you reference to 4; tail.prev
        ll.DeleteNode(curr);
        ll.PrintDLL(); //1->2->3->5;
        */
    }
}
