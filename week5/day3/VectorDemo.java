import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/* 
Vector datasturcture - dynamic array(the size of the array can be increased or decreased based
on the number of objects in the collection/datastructure).
add element
access element/find/search
modify element
remove an element
*/
public class VectorDemo {
    public static void main(String[] args) {
        //int []arr = new int[2]; // u have a fixed size of memory of 10*4 bytes = 40bytes;
        //initialize and allocate memory
        Vector<Integer> studentIds = new Vector<Integer>(2, 5);
        //insertion an element; duplicates are allowed, and the order of insertion is preseved.
        studentIds.add(1);
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(2);
        studentIds.add(3); //add the third element; it will say array of out bound.
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(4);
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(4);
        System.out.println(studentIds.capacity() + " " + studentIds.size());

        int sum = 0;
        //reading all the objects in the collections.
        Iterator<Integer> it = studentIds.iterator();
        while (it.hasNext()) {
            sum = sum + it.next();
        }

        //finding an element
        int idx = studentIds.indexOf(4);
        System.out.println("index of 4 is : " + idx);

        //remove an element;
        studentIds.remove(3);
    }
}