package day4;


public class IsPalindrome {
    public static void main(String[] args) {
        int []input = {1, 2, 5, 6, 7};
        int target = 9;
        //char []input = "madam".toCharArray();
        // ['m', 'a', 'd','a','m'];
        for (int i = 0; i<input.length; i=i+1) {
            for (int j = i+1; j<input.length; j++)
                if (input[i]+input[j] == target) {
                    System.out.println("i:" + input[i] + " " + "j:" + input[j]);
                    break;
                }
        }
        System.out.println();
        /*
        char []output = new char[input.length];
        for (int i=input.length-1, j=0; i>=0 ; i--) {
            output[j] = input[i];
            j++;
        }
        if (Arrays.compare(input, output) == 0) {
            System.out.println("The input string is a Palindrome");
        } else {
            System.out.println("The input string is not a Palindrome");
        }
        */
        // komal => i=0; k ; j=4
        // madam => a(1, 3)
        // int i =0, j = input.length-1;
        /*
        for (int i=0, j=input.length-1; i<=j; i++, j--) {
            if (input[i] == input[j]) {
                continue;
            }
            return;
        }
        System.out.println("The given string is a palindrome");
        */
    }
}
