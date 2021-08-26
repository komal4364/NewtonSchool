package revision;

import java.util.ArrayList;

public class NewtonSchoolBatch {
    private class PersonInfo {
        private String aadhar;
        private String pan;
        private String Passport;
    
    }
    
    private class Person {
        private String name;
        private String gender; //male/female
        private int age;
        private PersonInfo info;
        private String role; //instuctor, student;
    }

    private String batchname;
    private ArrayList<Person> people = new  ArrayList<>();

    private String classTime;
    public static void main(String[] args) {
        
    }
    public void AddStudent(Person student) {
        people.add(student);
    }
}
