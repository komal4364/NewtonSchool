import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        StringBuilder builder = new StringBuilder(input);
        builder = builder.reverse();
        int nonZeroindex = -1;
        for (int i = 0; i < builder.length(); i++) {
            nonZeroindex++;
            if (builder.charAt(i) != '0') {
                break;
            }
        }
        if (nonZeroindex == -1 || builder.length() == 0) {
            System.out.println(builder.toString());
        } else {
            System.out.println(builder.substring(nonZeroindex));
        }
    }
}
