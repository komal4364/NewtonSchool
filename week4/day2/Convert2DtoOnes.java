import java.util.Scanner;

public class Convert2DtoOnes {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();

		for (int testCase = 0; testCase < numTestCases; testCase++) {
			int M = in.nextInt(), N= in.nextInt();
			int [][]arr = new int[M][N];
			for (int row = 0; row < M; row++) { //row0
				boolean isRowSet = false;
				for (int col = 0; col < N; col++) {
					arr[row][col] = in.nextInt();
					if (isRowSet == true) {
						arr[row][col] = 1;
					}
					if (arr[row][col] == 1) {
						isRowSet = true;
					}
				}
				if (isRowSet) {
					for (int col = 0; col < N; col++) {
						if (arr[row][col] == 1) {
							break;
						}
						arr[row][col] = 1;
					}
				}
			}
			print2DMatrix(arr);
		}
        in.close();
	}

	private static void print2DMatrix(int [][]arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
