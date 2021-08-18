public class TowerOfHanoi {
    public static void main(String[] args) {
        int []moves = new int[1];
        solve(3, 'A', 'C', 'B', moves);
        System.out.println(moves[0]);
    }

    //solve(move n plates from tower A to C via B);
    // => solve(move n-1 plates from tower A to B via C)
    // moved last plate from A => C;
    // => solve(move n-1 plates form tower B, C, A);
    // T(n) <= O(n!)
    public static void solve(int n, char A, char C, char B, int[] moves) {
        if (n==0) {
            return;
        }
        solve(n-1, A, B, C, moves);
        System.out.println("Move disk "+ n + " from rod " +
                       A +" to rod " + C );
        moves[0]++;
        solve(n-1, B, C, A, moves);
    }
}