
package day4;

import java.util.Iterator;
import java.util.Stack;

/*
stack extends vector class, so the stack will be synchronized, recommended to use ArrayDequqe for stack
*/
public class stackDemo {
    public static void main(String[] args) {
        vectorStackDemo();
    }

    private static void vectorStackDemo() {
        Stack<String> stack = new Stack<String>();
        stack.push("komal");
        stack.push("kumar");
        stack.push("seelam");
        stack.push("krishna");
  
        // Iterator for the stack
        Iterator<String> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
  
        stack.pop();
  
        // Iterator for the stack
        itr = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}