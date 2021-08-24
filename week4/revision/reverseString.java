package revision;

public class reverseString {
    public static void main(String[] args) {
        String result = reverseStr("komal", 0, 4);
        System.out.println(result);
    }

    // reverseString(komal, 0, 4) => l + reverseString("koma", 0, 3)
    static String reverseStr(String inp, int s, int e) {
        if (s > e) {
            return "";
        }
        return inp.charAt(e) + reverseStr(inp, s, e-1);
    }
}
