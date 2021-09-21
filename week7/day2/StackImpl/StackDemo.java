package StackImpl;


public class StackDemo {
    public static void main(String[] args) {
        StringStack stk = new StringStack();
        stk.Push("komal");
        stk.Push("kumar");
        System.out.println(stk.Pop() + " " + stk.Size()); // kumar, 1
        stk.Push("bob");
        System.out.println(stk.Peek() + " " + stk.Size()); // bob, 2
        stk.Pop(); 
        stk.Pop();
        System.out.println(stk.Size()); // 0

        /*
        Stack<Integer> numbers = new Stack<Integer>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(5);
        System.out.println(numbers.empty() + " " + numbers.size());
        Integer temp = numbers.pop();
        System.out.println(temp);
        while (numbers.size() > 0) {
            System.out.print(numbers.pop() + " ");
        }
        System.out.println();
        System.out.println(numbers.empty() + " " + numbers.size());
        */
    }
}
