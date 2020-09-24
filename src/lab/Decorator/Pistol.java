package lab.Decorator;

import lab.Decorator.gunshop;

public abstract class Extra implements gunshop {

    protected gunshop gunshop;
    protected double price;
    protected String name;

    public Extra(gunshop gunshop, double price, String name) {
        this.gunshop = gunshop;
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return this.name + ", " + gunshop.getName();
    }

}
