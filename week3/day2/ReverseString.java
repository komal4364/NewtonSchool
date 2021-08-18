
    /*
        reverseStr(komal)
            l + reverseStr(koma)
                l + a + reverseStr(kom)
                    l + a + m + reverseStr(ko)
                        l + a + m + o + reverseStr(k) =  lamok

    */
public class ReverseString {
    //static String output= ""; // class level scope
    public static void main(String[] args) {
        //reverStrGlobal("komal");
        System.out.println(reverseStr("komal"));
    }
    /*
    private static void reverStrGlobal(String inp) {
        if (inp.length() == 0) { //
            return;
        }
        int inpLastIdx = inp.length()-1; //4
        output = output + inp.substring(inpLastIdx, inpLastIdx+1);
        reverStrGlobal(inp.substring(0, inpLastIdx));
    }
    */
    //komal => l + reverse(koma) '' ko => ok
                        //=> a + reverse(kom)
    private static String reverseStr(String inp) {
        if (inp.length() == 1 || inp.length() == 0) { //
            return inp; // return 'k';
        }
        int inpLastIdx = inp.length()-1; //4
        String firstStr = inp.substring(inpLastIdx, inpLastIdx+1);
        String remainingStr = inp.substring(0, inpLastIdx);
        String revStr = reverseStr(remainingStr);
        return firstStr + revStr;
    }
}