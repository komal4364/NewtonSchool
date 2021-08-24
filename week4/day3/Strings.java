package day3;


/*
Strings are objects or sequence of characters;
Java provides String class to manipulate Strings

The String class is immutable, so that once it is created a String object 
cannot be changed. The String class has a number of methods, 
some of which will be discussed below, that appear to modify strings. 
Since strings are immutable, what these methods really do is create and 
return a new string that contains the result of the operation.
*/
public class Strings {
    public static void main(String[] args) {
        /*helloworld is a string literal, java compiler create a string class 
        object and initializes the value to helloworld*/
        String greet1 = "helloworld";
        String greet2 = greet1;
        System.out.println(greet1.compareTo(greet2));
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);
        stringDemo();
    }

    private static void stringDemo() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
