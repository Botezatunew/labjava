package lab;

public class Bidi extends Gunshop {
    protected int quantity;
    public Bidi(String name, double price, double fire, int quantity ){
        super(name, price, fire);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патронов: " + nicotine + ", количество в упаковке: " + quantity);
    }

}
