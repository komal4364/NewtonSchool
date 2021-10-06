package onlinestockspan;

import java.util.ArrayList;
import java.util.Stack;

//always maintain an invariant that the stack is always having the minimum element at the top.
public class stockspan {
    public static void main(String[] args) {
        stockspan stockSpanner = new stockspan();
        stockSpanner.next(100); // return 1
        stockSpanner.next(80);  // return 1
        stockSpanner.next(60);  // return 1
        stockSpanner.next(70);  // return 2
        stockSpanner.next(60);  // return 1
        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85);  // return 6
        System.out.println();
    }

    Stack<Integer> prices;
    public stockspan() {
        prices = new Stack<Integer>();
    }

    public void next(int price) {
        int result = 1;
        if (prices.empty()) {
            prices.push(price);
        } else if (prices.peek() > price) {
            prices.push(price);
        } else { //top of the stack is smaller than price.
            ArrayList<Integer> nums = new ArrayList<>();
            while (!prices.empty() && prices.peek() <= price) {
                Integer val = prices.pop();
                nums.add(val);
                result++;
            }
            for (int i = nums.size()-1; i >=0; i--) {
                prices.push(nums.get(i));
            }
            prices.push(price);
        }
        System.out.print(result +" ");
    }
}
