package contest;

import java.util.Scanner;

public class InternetSpeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []inputs = in.nextLine().split(" ");
        int fileSize = Integer.parseInt(inputs[0]);
        int downloadSpeed = Integer.parseInt(inputs[1]);
        System.out.println(fileSize*8/downloadSpeed);
        in.close();
    }
}
