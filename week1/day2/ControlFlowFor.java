package day2;

public class ControlFlowFor {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) { //block
            System.out.println("Count is: " + i);
       }
        int[] numbers = {1,2,3,4,5,6,7,8,9,10, 100};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        int j = 0;
        // infinite loop
        for ( ; ; ) {
            if (j < 10) {
                j++;
                System.out.println("j: "+ j);
            } else {
                break;
            }
            // your code goes here
        }
    }
}
