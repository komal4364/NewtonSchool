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
public class DataStructure {
    public static void main(String[] args) {
        //int []arr = new int[2]; // u have a fixed size of memory of 10*4 bytes = 40bytes;
        Vector<Integer> studentIds = new Vector<Integer>();
        studentIds.add(1);
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(2);
        studentIds.add(3); //add the third element; it will say array of out bound.
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(4);
        System.out.println(studentIds.capacity() + " " + studentIds.size());
        studentIds.add(4);
        System.out.println(studentIds.capacity() + " " + studentIds.size());

        for (int i = 0; i < studentIds.size(); i++) {
            //obj[index]
            System.out.println(studentIds.get(i));
        }
        Iterator<Integer> it = studentIds.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}