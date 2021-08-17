import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferReaderFile {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/komal/newtonschool/week2/day5-1/array.txt";
        BufferedReader reader = new BufferedReader(
            new FileReader(filePath));
        String inp = reader.readLine();
        String inp1 = reader.readLine();
        String []arrInp = inp.split(",");
        Long []arr = new Long[arrInp.length];
        for (int i = 0; i < arrInp.length; i++) {
            arr[i] = Long.parseLong(arrInp[i]);
        }
        System.out.println(inp);
        System.out.println(Arrays.toString(arrInp));
        System.out.println(Arrays.toString(arr));
        reader.close();
    }
}
