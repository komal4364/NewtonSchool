
//access specifiers - private, protected, public;
public class Person { //datahiding - 
    Amazon shop;
    private int age;
    private String name;
    public int setAge(int age) {
        if (age > 120) {
            return -1;
        }
        this.age  = age; //this keyword is for self reference of the object.
        return 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void AddSurName(String surname) {
        if (surname == "" || surname == "------") {
            return;
        }
        name = surname + " "+ name;
    }
}