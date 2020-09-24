package lab.Decorator;

import lab.Decorator.Extra;
import lab.Decorator.Tobachini;

public class revolver extends Extra {
    public revolver(gunshop gunshop, double price, String name){
        super(gunshop, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + gunshop.getPrice();
    }
}
