

public class isplanidrome {
    public static void main(String[] args) {
        String inp = "madam";
        System.out.println(isPalindrome(inp.toCharArray(), 0, inp.length()-1));
    }
    private static boolean isPalindrome(char []inp, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return true;
        }
        return inp[startIdx] == inp[endIdx] && isPalindrome(inp, startIdx+1, endIdx-1);
    }
}
