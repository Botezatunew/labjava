package lab;

public class DesertEagle extends Gunshop {
    protected int quantity;
    public DesertEagle(String name, double price, double ammo, int quantity) {
        super(name, price, ammo);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патрон: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
