package lab;

public class P2000 extends Gunshop {
    protected int quantity;
    public P2000(String name,double price, double ammo, int quantity) {
        super(name, price, ammo);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патрон: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
