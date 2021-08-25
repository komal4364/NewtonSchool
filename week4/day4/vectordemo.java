package day4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/* vector is similar to arraylist; 
    - can store duplicates
   - is an ordered collection
    - can be re-sizable dynamically
    Differences with arraylist:
    - synchronized
    - contains legacy methods from earlier java versions that are not part of collections framework.

    Preferrable arraylist
*/
public class vectordemo {
    public static void main(String[] args) {
        vectorDemo();
    }
    private static void vectorDemo() {
        Vector<String> students = new Vector<String>();
        System.out.println(students.size());
        students.addAll(Arrays.asList("komal", "pratap", "krishna"));
        students.add("priyanka");
        System.out.println(students);
        students.add(1, "bob");
        students.add(2, "bob");
        students.remove("krishna");
        students.remove(0);
        System.out.println(students.get(2));
        System.out.println(students.indexOf("bob"));
        students.sort(null);
        System.out.println(students);
        for (String name : students) {
            System.out.print(name + ";");
        }
        System.out.println(" ");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ";");
        }
        System.out.println();
    }
}