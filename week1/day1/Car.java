package day1;

public class Car {
    String name;
    String mfgDate;
    public static void main(String[] args) {
        Car obj = new Car();
        obj.name = "ford ecosport";
        Car obj1 = new Car();
        obj1.name = "bmw";
        System.out.println(obj.getCarName());
        System.out.println(obj1.getCarName());
    }

    public String getCarName() {
        return name;
    }
}
