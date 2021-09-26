import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T > 0) {
			String inp = in.next();
			solve(inp);
			T = T-1;
		}
		in.close();
    }
    private static void solve(String inp) {
        inp = inp.toLowerCase();
		boolean []charPresent = new boolean[26];
		for (int i = 0; i < inp.length(); i++) {
			int idx = inp.charAt(i) - 'a';
            if (idx > 26) {
                continue;
            }
            charPresent[idx] = true;
		}
        boolean panagram = true;
        for (int i = 0; i < 26; i++) {
            if (charPresent[i] == false) {
                panagram = false;
            }
        }
        System.out.println(panagram ? 1 : 0);
	}
}
