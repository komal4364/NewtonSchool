

import java.util.Arrays;

public class Strings1 {
    public static void main(String[] args) {
        String []names={"komal", "kumar", "krishna"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println("seelam " + names[0]);
        System.out.println("This is a \"String\" object");
        stringDemo();
    }
    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
    private static void stringDemo() {
        String inp = "komal,arun,priyanka,krishna";
        String []names = inp.split(",");
        System.out.println(Arrays.toString(names));
        System.out.println(inp.charAt(2));
        System.out.println(inp.substring(2));
        System.out.println(inp.substring(2, 4));
        System.out.println(inp.contains("priyanka"));
        System.out.println(inp.replace("omal", "amal"));
        
    }
}
