
public class Amazon extends IOnlineShop {

    public void checkout(String paymentMode) {
        System.out.println("Amazon checkout :" + paymentMode);
    }

    @Override
    public void buy() {
        System.out.println("Amazon buy");
    }

    @Override
    public void sell() {
        // TODO Auto-generated method stub

    }

    @Override
    public void exchange() {
        // TODO Auto-generated method stub

    }
    
}