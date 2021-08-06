package day1;

/* 
format: accessSpecifier type variableName = value;
eg: final String name = "komal"; public int hieght = 10; private int wieght = 20;

DataTypes:
Basic/Primitive Types:
    --------------------------------------------------------
    Name       | Size    | DefaultVal |      Range        |
    --------------------------------------------------------
    1. byte    | 8 bits  |     0      |    -127 to 127    |
    2. short   | 16 bits |     0      |  -32768 to 32767  |
    3. int     | 32 bits |     0      |  -2^31 to 2^31-1  |
    4. long    | 64 bits |     0L     |  -2^63 to 2^63-1  |
    5. float   | 32 bits |     0.0f   |  depends          |
    6. double  | 64 bits |     0.0d   |  depends          |
    7. boolean | 1  bits |    false   |  true/false       |
    8. char    | 16 bits |   '\u0000' | '\u0000'-'\uffff' |

Derived Types:/datastructure
    1. String - char array ; immutable
    2. Arrays
    3. Linked Lists
    4. HashMap
    5. Tree
    6. Graph 
    7. Objects..
*/
public class DataTypes {
    public static void main(String[] args) {
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int decimalVal = 26;
        int hexVal = 0x1a;
        int binVal = 0b11010;
        double d1 = 1.234e2; //123.4
        float f1 = 123.43623f;
        String name = "komal"; //immutable
        char []name1 = "komal".toCharArray(); //[16bits , 16bits ...] = ["k", 'a', 'm', 'a', 'l']
        System.out.printf(" result: %b \n capitalC: %c \n b:%d \n s:%d \n decimalVal:%d \n hexVal:%x \n binVal:%d \n d1:%.5f \n f1:%.2f\n name:%s \n", 
            result, capitalC, b, s, decimalVal, hexVal, binVal, d1, f1, name);
        name1[1] = 'a';
        //name[1] = 'a';
        System.out.println(name1);
        System.out.println((int)f1);
    }
}
