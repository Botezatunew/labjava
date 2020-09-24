package lab;

public class AK47 extends  {
    protected int weight;
    public Snuff(String name, double price, double nicotine, int weight) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);
    }
}
