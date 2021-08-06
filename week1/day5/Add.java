package day5;

public class Add {
    int a, b;
    // return_type function_name(type1 arg1, type2 arg2, ...)
    // int AddIntegers(int a, int b);
    // No return type and it's doesn't have arguments;
    Add(){
        System.out.println("Constructor");
    }
    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        //Add addObj1 = new Add();
        Add addObj2 = new Add(2, 3);
        Add addObj3 = new Add(4, 5);
        //addObj2.AddIntegers();
        //addObj3.AddIntegers();
        int result = Add.AddIntegers(2,3) + Add.AddIntegers(4, 5);
        System.out.println(result);
        //return;
    }
    public static int AddIntegers(int a, int b) {
        return a+b;
    }
    public static boolean isEqualStrings(String a, String b) {
        return a.equals(b);
    }
    public  int MeanOfAnArray(int[] numbers) {
        return 0;
    }

    // int []numbers = {2, 3, 4, 5};
    //SumOfNumbers(numbers, 0, numbers.length-1); = numbers[0] + SumOfNumbers(numbers, 1, numbers.length-1)
    public int SumOfNumbers(int []numbers, int s, int e) {
        if (s>e) {
            return 0;
        }
        return numbers[s] + SumOfNumbers(numbers, s+1, e);
        /*
        int result = 0;
        for(int i=0; i<numbers.length;i++) {
            result= result +numbers[i];
        }
        return result;
        */
    }
}
