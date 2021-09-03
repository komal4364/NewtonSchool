import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int s = 0, e = input.length()-1;
		while (s <= e) {
			if (input.charAt(s) != input.charAt(e)) {
				System.out.println("0");
				break;
			}
			s = s+1;
			e = e-1;
		}
		if (s > e) {
			System.out.println("1");
		}
		in.close();
    }
}
