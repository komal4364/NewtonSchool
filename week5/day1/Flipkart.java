
public class Flipkart extends IOnlineShop {
    
    public void checkout() { //overriden this behavior (Method overriding)
        System.out.println("Flipkart Checkout");
    }

    
    @Override
    public void buy() {
        System.out.println("Flipkart buy");
    }

    @Override
    public void sell() {
        // TODO Auto-generated method stub

    }

    @Override
    public void exchange() {
        // TODO Auto-generated method stub

    }

    public void delivery() {
    }
}