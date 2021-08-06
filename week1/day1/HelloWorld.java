package day1;

/*
keywords: public, class, static, void, System;
Tip: Don't use keywords as program variables;
args: passing command line arguments to the problem at runtime.
*/

// java HelloWorld.java komal kumar
// args = ["komal", "kumar"]; args[0], args[1]
public class HelloWorld {// <access specifier> class <className>
    public static void main(String[] args) { //<access specifier> <keyword> 
        // <return type> main(arguments)
       HelloWorld obj = new HelloWorld();
       //HelloWorld obj1  = new HelloWorld();
       //HelloWorld.Print("komal"); 
       obj.Print("komal");
    }
    public void Print(String name) {
        System.out.println("hello World " + name);
    }
}