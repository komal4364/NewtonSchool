package day1;

/*
Assignment:
 = : Simple Assignment

Arithmetic: (Two operands in action)
 + : Additive (for numerics and string concat)
 - : Subtract
 * : Multiply
 / : Division
 % : Remainder

Unary: (One operands in action)
 +  : indicate the sign of a numeric values; default positive
 -  : negates the numeric value 
 ++ : increment the value by 1
 -- : decrement the value by 1
 !  : logical complement operator; inverts a boolean value
 
Equality and Relational:
 == : Equal to
 != : Not Equal to
 >  : Greater than
 >= : greater than or equal to
 <  : less than
 <= : less than or equal to

Conditional Operators:
 && : conditional AND
 || : conditional OR
 ?: : ternary(short hand for if-then-else)

Type Comparision:
 instanceof : verifies if the object is of type (eg: instanceof(10, int))

BitWise:
 ~   : unary bitwise complement
 <<  : Signed left shift
 >>  : Signed right shift
 >>> : unsigned right shift
 &   : bitwise and
 ^   : xor
 |   : or
*/
public class Operators {
    public static void main(String[] args) {
        System.out.println("---- Arithmetic Demo ----");
        Demo.ArithDemo();
        System.out.println("---- Concat String Demo ----");
        Demo.ConcatDemo();
        System.out.println("---- Unary Demo ----");
        Demo.UnaryDemo();
        System.out.println("---- PrePost Demo ----");
        Demo.PrePostDemo();
        System.out.println("---- Comparision Demo ----");
        Demo.ComparisonDemo();
        System.out.println("---- Conditional Demo ----");
        Demo.ConditionalDemo();
        System.out.println("---- InstanceDemo Demo ----");
        Demo.InstanceOfDemo();
        System.out.println("---- BitWise Demo ----");
        Demo.BitWiseDemo();
    }

    static class Demo {
        static void BitWiseDemo() {
                // Initial values
            int a = 5;
            int b = 7;
    
            // bitwise and
            // 0101 & 0111=0101 = 5
            System.out.println("a&b = " + (a & b));
    
            // bitwise or
            // 0101 | 0111=0111 = 7
            System.out.println("a|b = " + (a | b));
    
            // bitwise xor
            // 0101 ^ 0111=0010 = 2
            System.out.println("a^b = " + (a ^ b));
    
            // bitwise not
            // ~0101=1010
            // will give 2's complement of 1010 = -6
            System.out.println("~a = " + ~a);
    
            // can also be combined with
            // assignment operator to provide shorthand
            // assignment
            // a=a&b
            a &= b;
            System.out.println("a= " + a);


            a = 5;
            b = -10;
    
            // left shift operator
            // 0000 0101<<2 =0001 0100(20)
            // similar to 5*(2^2)
            System.out.println("a<<2 = " + (a << 2));
    
            // right shift operator
            // 0000 0101 >> 2 =0000 0001(1)
            // similar to 5/(2^2)
            System.out.println("b>>2 = " + (b >> 2));
    
            // unsigned right shift operator
            System.out.println("b>>>2 = " + (b >>> 2));
        }
        static void ConditionalDemo() {
            int value1 = 1;
            int value2 = 2;
            if((value1 == 1) && (value2 == 2))
                System.out.println("value1 is 1 AND value2 is 2");
            if((value1 == 1) || (value2 == 1))
                System.out.println("value1 is 1 OR value2 is 1");
        
            int result;
            boolean someCondition = false;
            result = someCondition ? value1 : value2;
            System.out.println("result: " + result);
        }

        static void ComparisonDemo() {
            int value1 = 1;
            int value2 = 2;
            if(value1 == value2)
                System.out.println("value1 == value2");
            if(value1 != value2)
                System.out.println("value1 != value2");
            if(value1 > value2)
                System.out.println("value1 > value2");
            if(value1 < value2)
                System.out.println("value1 < value2");
            if(value1 <= value2)
                System.out.println("value1 <= value2");
        }

        static void PrePostDemo() {
            int i = 3;
            i++;
            // prints 4
            System.out.println(i);
            ++i;			   
            // prints 5
            System.out.println(i);
            // prints 6
            System.out.println(++i);
            // prints 6
            System.out.println(i++);
            // prints 7
            System.out.println(i);
        }
        static void UnaryDemo() {     
            int result = 1;
            // result is now 1
            System.out.println(result);

            result--; // result = result-1;
            // result is now 0
            System.out.println(result);

            result++; // result = result +1;
            // result is now 1
            System.out.println(result);

            result = -result;
            // result is now -1
            System.out.println(result);

            boolean success = false;
            // false
            System.out.println(success);
            // true
            System.out.println(!success); // success = !success;
            //false
            System.out.println(success);
        }
        static void ConcatDemo(){
            String firstString = "This is";
            String secondString = " a concatenated string.";
            String thirdString = firstString+secondString;
            System.out.println(thirdString);
        }

        static void ArithDemo() {
            int result = 1 + 2;
            // result is now 3
            System.out.println("1 + 2 = " + result);
            int original_result = result;
    
            result = result - 1;
            // result is now 2
            System.out.println(original_result + " - 1 = " + result);
            original_result = result;
    
            result = result * 2;
            // result is now 4
            System.out.println(original_result + " * 2 = " + result);
            original_result = result;
    
            result = result / 2; //10/2 -> 5, 0 2*5+0 -> 10
            // result is now 2
            System.out.println(original_result + " / 2 = " + result);
            original_result = result;
    
            result = result + 8;
            // result is now 10
            System.out.println(original_result + " + 8 = " + result);
            original_result = result;
    
            result = result % 7; //-> 10 % 7 => 3(remainder), 1-> q; q*divisor + 3 = 10;
            // result is now 3
            System.out.println(original_result + " % 7 = " + result);
        }

        static class Parent {}
        static class Child extends Parent implements MyInterface {}
        interface MyInterface {}
        static void InstanceOfDemo() {
            Parent obj1 = new Parent();
            Parent obj2 = new Child();
    
            System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
            System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
            System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
            System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
            System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
            System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
        }
    }
}
