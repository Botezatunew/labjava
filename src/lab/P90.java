package lab;

public class P90 extends Gunshop {
    protected int quantity;
    public P90 (String name, double price, double ammo, int quantity) {
        super(name, price, ammo);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патрон: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
