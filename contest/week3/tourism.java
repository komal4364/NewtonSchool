import java.util.Scanner;

public class tourism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int unitWalkCost = in.nextInt();
        int teleportCost = in.nextInt();
        Integer []arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        long result = 0;
        for (int i = 1 ; i < N; i++) {
            int dist = arr[i] - arr[i-1];
            long unitCost = dist * unitWalkCost;
            result = result + (unitCost > teleportCost ? teleportCost : unitCost);
        }
        System.out.println(result);
    }
}
