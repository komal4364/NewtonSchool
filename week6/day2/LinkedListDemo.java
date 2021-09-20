package day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Step1 : create a object called person (name, age, batch)
Step2: connect this object as a single linked list.
*/
class Person {
    String name; // 16bytes, 32bytes.
    int age; // 4bytes
    String batch; // 16bytes

    Person(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }
}

// Person []students = new Person[1000]; /// 1000 * 40bytes = 40000bytes;

/* we need a node that holds the data and reference to next node; */
class Node {
    Person data;
    Node next;

    Node(Person data) {
        this.data = data;
        this.next = null;
    }
}

/*
 * head : 1->2->3 nhead - null; nhead -> 1 (head ->1 ->2 ->3) head = head.next;
 * head -> (2->3); nhead -> 1; nhead.next = null;
 */
// user defined datatype class Car, Class Shop, etc,,
class LinkedListCustom {
    int len = 0;
    Node head = null; // field

    void ReverseLinkedList() {
        Node nHead = null; // step1
        while (this.head != null) {
            Node temp = head;
            head = head.next;
            if (nHead == null) {
                nHead = temp;
                nHead.next = null;
            } else {
                temp.next = nHead;
                nHead = temp;
            }
        }
        this.head = nHead;
    }

    void AddNodeAtPosition(Person data, int pos) {
        Node curr = this.head;
        Node temp = new Node(data); // memory allocaation for new node;
        if (pos == 1) {
            temp.next = this.head;
            this.head = temp;
            return;
        }
        int i = 1;
        while (i != pos - 1) { // condition in which you have to break;
            curr = curr.next;
            i++;
        }
        temp.next = curr.next;
        curr.next = temp;
    }

    void AddNodeAtFront(Person data) {
        Node temp = new Node(data); // [data | null] //step1: create memory for the new node in the linked list.
        if (head == null) {
            head = temp; // corner case; where we are having no nodes in the linked list.
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /*
    public static Node Merge (Node head1, Node head2){
        Node nhead = null;
        if (head1.val < head2.val) {
            nhead = head1;
            head1 = head1.next;
            nhead.next = null;
        } else {
            nhead = head2;
            head2 = head2.next;
            nhead.next = null;
        }
        Node curr = nhead;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                curr.next = head1;
                head1 = head1.next;
                curr = curr.next;
                curr.next = null;
            } else {
                curr.next = head2;
                head1 = head2.next;
                curr = curr.next;
                curr.next = null;
            }
        }
        while (head1 != null) {
            curr.next = head1;
        }
        while (head2 != null) {
            curr.next = head2;
        }
        return nhead;
    }
    */
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10]; // static array
        List<Integer> nums = Arrays.asList(arr); // dynamic array

        LinkedListCustom ll = new LinkedListCustom();
        Person p1 = new Person("komal", 31, "explorer");
        ll.AddNodeAtFront(p1);
        ll.print();
        Person p2 = new Person("anil", 28, "explorer");
        ll.AddNodeAtFront(p2);
        ll.print();
        Person p30 = new Person("kumar", 30, "explorer");
        ll.AddNodeAtPosition(p30, 2);
        ll.print();
        Person p25 = new Person("guru", 25, "explorer");
        ll.AddNodeAtPosition(p25, 1);
        ll.print();
        Person pxyz = new Person("xyz", 25, "explorer");
        ll.AddNodeAtPosition(pxyz, 4);
        ll.print();
        ll.ReverseLinkedList();
        ll.print();
        /*
        //LinkedList<Person> students = new LinkedList<>();
        Person p1 = new Person("komal", 31, "explorer");
        students.add(p1);
        for (Person person : students) {
            System.out.print(person.name + ",");
        }
        System.out.println();
        Person p2 = new Person("anil", 28, "explorer");
        students.add(p2);
        for (Person person : students) {
            System.out.print(person.name + ",");
        }
        System.out.println();
        Iterator<Person> it = students.iterator();
        while (it.hasNext()) {
            Person plocal = it.next();
            System.out.print(plocal.name + ",");
        }
        System.out.println();
        */
    
    }



}