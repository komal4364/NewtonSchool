import java.util.Scanner;

public class Buildings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =Integer.parseInt(in.nextLine());
        String []inp = in.nextLine().split(" ");
        int []arrInp = new int[inp.length];
        for (int i = 0; i < inp.length; i++) {
            arrInp[i] = Integer.parseInt(inp[i]);
        }
        in.close();
        System.out.println(countBuildings(arrInp, N)); 
    }

    static int countBuildings(int arr[], int n) {
        int count = 1;
        int curr_max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > curr_max) {
                count++;
                curr_max = arr[i];
            }
        }
 
        return count;
    }
}
