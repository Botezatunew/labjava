package lab.Decorator;

public class Exclusive extends Extra {
    public Exclusive(gunshop gunshop, double price, String name){
        super(gunshop, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + gunshop.getPrice();
    }
}
