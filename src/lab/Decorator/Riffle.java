package lab.Decorator;

public class Delivery extends Extra {
    public Delivery(gunshop gunshop, double price, String name){
        super(gunshop, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + gunshop.getPrice();
    }
}
