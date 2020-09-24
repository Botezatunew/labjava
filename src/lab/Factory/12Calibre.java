package lab.Factory;

public class AmmoFactory {
    public ammottes getammottes(AmmoTypes type) {
        Ammo toReturn = null;
        switch (type) {
            case Calibre:
                toReturn = new 9Calibre();
                break;
            case XSSILVER:
                toReturn = new 12Calibre();
                break;
            case XSTYLE:
                toReturn = new 37Calibre();
                break;
            default:
                throw new IllegalArgumentException("Wrong ammo type:" + type);
        }
        return toReturn;
    }
}
