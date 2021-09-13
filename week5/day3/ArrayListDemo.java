import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(2);
        names.add("student1");
        names.add("student2");
        System.out.println(names.size());
        names.add("student3");
        System.out.println(names.size());
        names.add("student4");
        System.out.println(names.size());
    }
}