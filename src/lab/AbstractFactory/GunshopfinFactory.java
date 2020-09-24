package lab.AbstractFactory;

public class GunfinFactory implements GunshopAbsFactory {
    @Override
    public Hard createHard() {
        return new GunfinHard();
    }

    @Override
    public Light createLight() {
        return new GunfinLight();
    }
}
