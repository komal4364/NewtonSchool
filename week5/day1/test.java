
//three action that an animal can do;
interface IAnimal {
    void eat();
    void walk();
    void sleep();
}

//interface doesn't allow any implementation;
//it only allows to declare an action/contract.
interface IShop {
    void buy();
    void sell();
    void exchange();
    //void delivery();
    //void checkout();
}

interface IDelivery {

}

abstract class IKirnaShop implements IShop {
    public void checkout() {
        System.out.println("Kirana Checkout");
    }
}

//abstract class similar to interface, but they allow
//certain implementations.
abstract class IOnlineShop implements IShop, IDelivery {
    public void checkout() { //base class implementation
        System.out.println("Checkout");
    }
    public void buy() {
        System.out.println("Ionlineshop buy");
    }
}

public class test {
    public static void main(String[] args) {
        
    }
}