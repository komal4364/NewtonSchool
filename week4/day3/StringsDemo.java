import java.util.Arrays;

public class StringsDemo {
    /*
    CharacterSet - Ascii and utf-8
    int []arr
    char []arr => [k, o, m, a, l]
    */
    public static void main(String[] args) {
        char []arr = {'k', 'o', 'm', 'a', 'l'};
        System.out.println(Arrays.toString(arr));
        arr[1] = '1';
        System.out.println(Arrays.toString(arr));
        String name = "komal"; //directly assinged
        //name[1] = 'a'; Not legal
        name = "k1mal";
        System.out.println(name.length());
        System.out.println(name);
        String name2 = new String(arr); // new - allocating memory and then creating string from array of characters.
        System.out.println(name2);
        char []name2chars = name2.toCharArray();
        name2chars[1] = 'a';
        System.out.println(name2);
        System.out.println(Arrays.toString(name2chars));
        //name2 => k, 1, m, a, l
        //name2chars => k, 1, m, a, l
        //name2chars => k, a, m, a, l
        //printed out
        //name2chars[0]
        //To compare the value of the strings use equals method.
        //To compare the if both strings are pointing to same address then use ==
        System.out.println(name + " " + name2);
        System.out.println(name.equals(name2));
    }
}
