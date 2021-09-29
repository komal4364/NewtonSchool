package linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList ll = new LinkedList(); //head -> null;
        int N = in.nextInt();
        while (N > 0) {
            N--;
            ll.AddNodeAtLast(in.nextInt());
        }
        ll.PrintDLL();
        in.close();
    }
}
