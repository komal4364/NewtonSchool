package day4;

import java.util.Arrays;

public class ArrayAlternateSumProduct {
    public static void main(String[] args) {
        SumProductAlternateDemo();
    }
    static void SumProductAlternateDemo() {
        int[] arg = {1,2,3,4,5};
        int sum = 0;
        int prod = 1;
        for (int i : arg) {
            sum += i;
            prod *= i;
        }
        System.out.printf("sum: %d; prod: %d", sum, prod);
        System.out.println(Arrays.stream(arg).sum());
        System.out.println(Arrays.stream(arg).count());
    }
}
