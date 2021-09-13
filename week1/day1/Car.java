package day1;

public class CarWash {
    void wash(Car car) {
        System.out.println("Clean outside car");
        //car.cleanInternally();
    }
}

//FordCar and BMWCar these two inherited some properties and behvior from the base class
//inheritance.
public class FordCar extends Car { //derived class. 
    Integer carMfgPlace;
    BMWCar bmwobj; //has a bmwcar
    public static void main(String[] args) {
        FordCar obj = new FordCar(); //initialize memory; int []arr = new int[10];
        //Person p1 = new Person(); p1.name = "komal", p1.dob = xyz, ...
        //Person p2 = new Person(); p2.name = "krishna", p2.dob = abc, ...
        obj.turnOnAC();
        obj.mfgDate;
        obj.voiceCalling() // compiler error; bmwcar is not fords base class. bmwcar instance is just a
        //member variable in this class.
        //obj.bmobj.voiceCall();
    }
    public void glassWiping() { //clean glass with a button.

    }
}

public class BMWCar extends Car { //derived classes
    public static void main(String[] args) {
        BMWCar obj = new BMWCar(); //initialize memory; int []arr = new int[10];
        //Person p1 = new Person(); p1.name = "komal", p1.dob = xyz, ...
        //Person p2 = new Person(); p2.name = "krishna", p2.dob = abc, ...
        obj.turnOnAC();
    }
    public void voiceCall() {

    }
}


interface ICar { //only signature. ISeries {int getNext()} ; oddSeries (1, 3, 5, ...), evenSequn
    void moveForward(int units);
    void changeGear();
}

public class TataCar implement ICar {
    void moveForward(int units) {
        System.out.println("moving forward by units" + units)
    }
    void changeGear() {
        System.out.println("Change Gear");
    }
}

public class ToyatoCar implemnts ICar {
    void moveForward(int units) {
        System.out.println("moving forward by units" + units)
    }
    void changeGear() {
        System.out.println("Change Gear");
    }
}

private class Car { //Base Class
    String name;
    String mfgDate;
    String mfgName;

    public String toString() {
        return "Car Object";
    }

    public void moveForward(int units) {
        System.out.println("moving forward");
    }
    public void changeGear(int gearNum) {
        System.out.println("changing gear number to " + gearNum);
    }
    public void turnOnAC() {
        System.out.println("turing on ac");
    }

    public String getCarName() {
        return name;
    }
}
