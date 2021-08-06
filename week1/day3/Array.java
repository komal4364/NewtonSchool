package day3;

import java.util.Arrays;

/*
An array is a container object that holds a fixed number of values of a single type. 
The length of an array is established when the array is created. 
After creation, its length is fixed. 

Declaring Arrays:
byte[] anArrayOfBytes;
short[] anArrayOfShorts;
long[] anArrayOfLongs;
float[] anArrayOfFloats;
double[] anArrayOfDoubles;
boolean[] anArrayOfBooleans;
char[] anArrayOfChars;
String[] anArrayOfStrings;
You can also place the brackets after the array's name:
float anArrayOfFloats[]; // this form is discouraged
*/
public class Array {
    public static void main(String[] args) {
        //ArrayDemo();
        //ArrayInlineDemo();
        //ArrayCopy();
        //ArrayManipulations();
        //ArraySearch();
        ArrayCompare();
        //ArrayCopyOf();
        //ArrayDeepEqual();
    }

    static void ArrayDeepEqual() {
                // Get the Arrays
        int intArr[][] = { { 10, 15, 22} };
  
        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 23 } };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.deepEquals(intArr, intArr1));
    }

    static void ArrayCopyOf() {
         // Get the Array
         int intArr[] = { 10, 20, 15, 22, 35 };
  
         // To print the elements in one line
         System.out.println("Integer Array: "
                            + Arrays.toString(intArr));
   
         System.out.println("\nNew Arrays by copyOf:\n");
   
         System.out.println("Integer Array: "
                            + Arrays.toString(
                                  Arrays.copyOf(intArr, 20)));

        int intArr1[] = { 10, 20, 15, 22, 35 };
  
        // To print the elements in one line
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr1));
  
        System.out.println("\nNew Arrays by copyOfRange:\n");
  
        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOfRange(intArr1, 1, 10)));
    }

    static void ArrayCompare() {

        // Get the Array
        int intArr[] = { 10, 15, 20};
  
        // Get the second Array
        int intArr1[] = { 10, 15, 20};
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr, intArr1));
    }

    static void ArraySearch() {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        Arrays.sort(intArr);
  
        int intKey = 20;
  
        System.out.println(intKey
                        + " found at index = "
                           + Arrays
                                 .binarySearch(intArr, intKey));

                                 // Get the Array
  
        System.out.println(
            intKey
            + " found at index = "
            + Arrays
                  .binarySearch(intArr, 1, 3, intKey));
    
    }
    static void ArrayManipulations() {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
        System.out.println();        
    }

    static void ArrayCopy() {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
            /*
        String[] copyto = new String[copyFrom.length];
        for (int i = 1; i < 4; i++) {
            copyto[i] = copyFrom[i];
        }
        */
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
        System.out.println();
    }

    static void ArrayInlineDemo() {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }

    static void ArrayDemo() {
        //String[] names = {"komal", "kumar", "john"};
        int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
         // declares an array of integers
        //int[] anArray;
        //anArray[0] = 10;
         // allocates memory for 10 integers
         //anArray = new int[10];
        
         // initialize first element
         anArray[0] = 100;
         // initialize second element
         anArray[1] = 200;
         // and so forth
         anArray[2] = 300;
         anArray[3] = 400;
         anArray[4] = 500;
         anArray[5] = 600;
         anArray[6] = 700;
         anArray[7] = 800;
         anArray[8] = 900;
         anArray[9] = 1000;
         
         System.out.println("Element at index 0: "
                            + anArray[0]);
         System.out.println("Element at index 1: "
                            + anArray[1]);
         System.out.println("Element at index 2: "
                            + anArray[2]);
         System.out.println("Element at index 3: "
                            + anArray[3]);
         System.out.println("Element at index 4: "
                            + anArray[4]);
         System.out.println("Element at index 5: "
                            + anArray[5]);
         System.out.println("Element at index 6: "
                            + anArray[6]);
         System.out.println("Element at index 7: "
                            + anArray[7]);
         System.out.println("Element at index 8: "
                            + anArray[8]);
         System.out.println("Element at index 9: "
                            + anArray[9]);
    }
}
