package lab;

public class CZ75Auto extends Gunshop {
    protected int weight;
    public CZ75Auto(String name,double price, double ammo, int weight) {
        super(name, price, ammo);
        System.out.println("Название: " + name + ", цена: " + price + ", количество патрон: " + nicotine + ", вес: " + weight);
    }
}
