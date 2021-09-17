package day4;

import java.util.HashMap;
import java.util.Map;

class College {
    String name;
    College(String name) {
        this.name = name;
    }
}

/* given an array of numbers, then given a target number find if it exists in the array*/
public class revisionMap {
    public static void main(String[] args) {
        Map<String, College> dict = new HashMap<String, College>();
        dict.put("IITM", new College("IIT Madras"));
        dict.put("IITB", new College("IIT Bombay"));
        dict.put("IITD", new College("IIT Delhi"));
        College iitm = dict.get("IITM");
        System.out.println(iitm.name);
    }
}