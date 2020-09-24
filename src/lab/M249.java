package lab;

import lab.Decorator.Gunshop;

public abstract class ammo implements Gunshop {
    protected String name;
    protected double ammo;
    protected double price;


    public Gunshop(String name, double price, double ammo) {
        this.name = name;
        this.price = price;
        this.ammo = ammo;
    }



    public double getPrice() {
        return this.price;
    }

    public String getName  () {
        return this.name;
    }
}

