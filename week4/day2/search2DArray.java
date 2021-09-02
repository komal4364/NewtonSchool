import java.util.Scanner;

public class search2DArray {

	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int q = sc.nextInt();
		int mat[] = new int[m*n];
		int matSize = m*n;

		for(int i = 0; i < m*n; i++)
		{
			
				int ele = sc.nextInt();
				mat[i] = ele;
			
		}

		Arrays.sort(mat);

		for(int i = 1; i <= q; i++)
		{
			
			int qs = sc.nextInt();
			System.out.println(isPresent(mat, matSize, qs));
			
		}


	}

	static String isPresent(int mat[], int size, int ele)
	{
		    int l = 0, h = size-1;
			while(l <= h)
			{
				int mid = l + (h-l)/2;
				if(mat[mid] == ele)
				   return "Yes";
				else if(mat[mid] > ele)
				    h = mid - 1;
				else l = mid+1;
				   
			}

			return "No";
	}
}
