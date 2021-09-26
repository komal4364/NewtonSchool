import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Find all the positions of the all the character in the given input string;
eg: madam
m - [0, 4]
a - [1, 3]
d - [2]

String inp = "komal is from hyd";
String []tokens = inp.split(); ["komal", "is", "from", "hyd"];
String inp1 = "1;2;3;4";
String []tokens1 = inp1.split(";") => ["1", "2", "3", "4"];
inp1.split() => ["1;2;3;4"];
*/
public class findcharpositions { //datatype that i am creating.
    public static void main(String[] args) { //starting point;
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine(); //"komal is from hyd" //nextline
        inp.split(" "); //split the input string by a pattern is " "
        in.close();
        solve(inp);
    }
    private static void solve(String inp) {
        Map<Character, ArrayList<Integer>> lookup = new TreeMap<>();
        //madam;
        for (int i = 0; i < inp.length(); i++) { //iterating over the input
            Character ch = inp.charAt(i);  //reading the char at that idx.
            if (lookup.get(ch) == null) { //is this character seen already. not seen
                lookup.put(ch, new ArrayList<>()); //allocating memory for arraylist;
            }
            ArrayList<Integer> indexes = lookup.get(ch); //get the reference to that memory;
            indexes.add(i);
        }
        /*
            m - [0, 4], a - [1, 3], d -> [2]
        */
        for (Character ch : lookup.keySet()) { //keyset returnn [m, a, d]
            ArrayList<Integer> indexes = lookup.get(ch);
            System.out.println(ch + " => " + Arrays.toString(indexes.toArray()));
        }
    }
}
