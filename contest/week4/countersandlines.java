import java.util.Scanner;

public class countersandlines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double M = in.nextDouble(), N = in.nextDouble(), K = in.nextDouble();
        in.close();
        Long result = (long) Math.ceil(maxKvisitors(M, K, N));
        System.out.println(result);
    }

    private static Double find(Double mid, Double K) {
        Double counter = K;
        if (counter > mid) {
            counter = mid;
        }
        K = K-counter;
        return K + counter * (2 * mid - counter+1)/2;
    }

    private static double maxKvisitors(Double M, Double K, Double N) {
        double start = 1, end = N+1;
        while (end - start > 1) {
            Double mid = start + (end - start)/2;
            Double pep = find(mid, K) + find(mid, M-K+1) - mid;
            if (pep > N) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return start;
    }
}
