package day2;

import java.util.Iterator;
import java.util.LinkedList;


/*
Step1 : create a object called person (name, age, batch)
Step2: connect this object as a single linked list.
*/
class Person {
    String name; //16bytes, 32bytes.
    int age; //4bytes
    String batch; //16bytes
    Person(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }
}

//Person []students = new Person[1000]; /// 1000 * 40bytes = 40000bytes;

/*we need a node that holds the data and reference to next node; */
class Node {
    Person data;
    Node next; 
    Node(Person data) {
        this.data = data;
        this.next = null;
    }
}
//user defined datatype class Car, Class Shop, etc,,
class LinkedListCustom {
    Node head = null; // field

    void AddNodeAtFront(Person data) {
        Node temp = new Node(data); // [data | null] //step1: create memory for the new node in the linked list.
        if (head == null) {
            head = temp; //corner case; where we are having no nodes in the linked list.
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
}

public class LinkedListDemo {
    public static void main(String[] args) {
        /*
        LinkedListCustom ll = new LinkedListCustom();
        Person p1 = new Person("komal", 31, "explorer");
        ll.AddNodeAtFront(p1);
        ll.print();
        Person p2 = new Person("anil", 28, "explorer");
        ll.AddNodeAtFront(p2);
        ll.print();
        */
        LinkedList<Person> students = new LinkedList<>();
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
    }
}