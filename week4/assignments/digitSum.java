import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int digitSum = 0;
        for (int i = 0; i < input.length(); i++) {
            digitSum += input.charAt(i) - '0';
        }
        in.close();
        System.out.println(digitSum);
    }
}
