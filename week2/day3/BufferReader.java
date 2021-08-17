import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        String inp = reader.readLine();
        String []arrInp = inp.split(",");
        Long []arr = new Long[arrInp.length];
        for (int i = 0; i < arrInp.length; i++) {
            arr[i] = Long.parseLong(arrInp[i]);
        }
        System.out.println(inp);
        System.out.println("stringInp:" + Arrays.toString(arrInp));
        System.out.println("intInp:" +  Arrays.toString(arr));
        reader.close();
    }
}
