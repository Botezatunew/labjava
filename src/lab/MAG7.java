package lab;

public class MAG7 extends Gunshop{
    protected int quantity;
    public MAG7(String name,double price, double ammo, int quantity) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патрон: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
