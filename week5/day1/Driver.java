
public class Driver {
    public static void main(String[] args) {
        Flipkart obj = new Flipkart();
        ManufacturingUnit mobj = new ManufacturingUnit(obj);
        mobj.procure();
        Amazon aObj = new Amazon();
        mobj.setShop(aObj);
        mobj.procure();
    }
}

//tightly coupled code; //
class ManufacturingUnit {
    IShop shop;
    ManufacturingUnit(IShop shop) {
        this.shop = shop;
    }
    void procure() {
        this.shop.buy();
    }
    void setShop(IShop shop) {
        this.shop = shop;
    }
}