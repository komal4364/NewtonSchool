package contest;

import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []alice = in.nextLine().split(" ");
        String []bob = in.nextLine().split(" ");
        int x1 = Integer.parseInt(alice[0]);
        int y1 = Integer.parseInt(alice[1]);
        int x2 = Integer.parseInt(bob[0]);
        int y2 = Integer.parseInt(bob[1]);
        if (x2 == x1) {
            int slope = (y2-y1);
            if (slope > 0) {
                System.out.println("North");
            } else {
                System.out.println("South");
            }
        } else {
            int slope = (y2-y1)/(x2-x1);
            if (slope == 0) {
                if (x2-x1 > 0) {
                    System.out.println("East");
                } else {
                    System.out.println("West");
                }
            } else if (slope > 0) {
                if (y2-y1 > 0 && x2-x1>0) {
                    System.out.println("North East");
                } else if (y2-y1<0 && x2-x1 < 0) {
                    System.out.println("South West");
                }
            } else {
                if (y2-y1 > 0 && x2-x1<0) {
                    System.out.println("North West");
                } else {
                    System.out.println("South East");
                }
            }
        }
        in.close();
    }
}
