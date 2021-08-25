package day4;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        linkedListDemo();
    }
    private static void linkedListDemo() {
        LinkedList<String> students = new LinkedList<String>();
        students.add("komal");
        students.add("priyanka");
        students.add("kumar");
        students.add(1, "bob");
        System.out.println(students.get(1));
        students.set(1, "alice");
        System.out.println(students);
        students.addFirst("first");
        students.addLast("last");
        System.out.println(students);

        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ";");
        }
        System.out.println();
    }
}