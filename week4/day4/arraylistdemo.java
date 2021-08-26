package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylistdemo{
    public static void main(String[] args) {
        arrayListDemo();
    }
    private static void arrayListDemo() {
        List<String> students = new ArrayList<String>();
        System.out.println(students.size());
        students.addAll(Arrays.asList("komal", "pratap", "krishna"));
        students.add("priyanka");
        System.out.println(students);
        students.add(1, "bob");
        students.add(2, "bob");
        students.remove("krishna");
        students.remove(0);
        System.out.println(students.get(2));
        System.out.println(students.indexOf("bob"));
        students.sort(null);
        System.out.println(students);
        for (String name : students) {
            System.out.println(name);
        }
    }
}