package lab;

import lab.Composite.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//            для первой работы наследование
//        Object[] array = new Object[11];
//        Object obj = null;
//        Random randomizer = new Random();
//        for (int i=0; i<11; i++) {
//            int randomNumber = randomizer.nextInt(11);
//            switch(randomNumber) {
//                case 0:
//                    obj = new Bidi("Darshan", 2.25,1.9,15);
//                    break;
//                case 1:
//                    obj = new CZ75Auto("Pistik", 9.85, 30, 86);
//                    break;
//                case 2:
//                    obj = new DEsertEagle("CarGun", 19.75, 7.2, 3);
//                    break;
//                case 3:
//                    obj = new P2000("Classic",2.20, 0.5,20);
//                    break;
//                case 4:
//                    obj = new CMAG7("PP", 9.50, 1.2, 20);
//                    break;
//                case 5:
//                    obj = new Nova("Must Have shotgun", 11.20, 450, 125 );
//                    break;
//                case 6:
//                    obj = new MAC10("Dji Sam Soe",4.50,2.2, 16 );
//                    break;
//                case 7:
//                    obj = new SG552("Cool", 9.25, 12, 50);
//                    break;
//                case 8:
//                    obj = new AK47("Putin", 5.25, 12, 75);
//                    break;
//                case 9:
//                    obj = new P90("Petuch", 2.5, 0.4, 20);
//                    break;
//            }
//            array[i] = obj;
//        }


//        для третьей работы декоратор
//        Tobachini order = new gunshop("Must Have", 11.20, 450, 125 );
//        order = new myata(order,0.75,"ammo");
//        order = new Delivery (order, 7.50, "Tomsk");
//        order = new Exclusive(order,3.40, "Exclusive Set");
//        System.out.println(order.getPrice());
//        System.out.println(order.getName());

//        для четвертой работы фабрика
//        ammoFactory factory = new ammoFactory();
//        ammo XSsilver = factory.getammo(ammoTypes.9calibre);
//        ammo XSblue = factory.getammo(ammoTypes.12calibre);
//        ammo XStyle = factory.getammo(ammoTypes.37calibre);
//
//        45calibre.shot();
//        57calibre.shot();
//        83calibre.shot();

//        для пятой работы регулярные выражения
//        String text = "Огнестрельное оружие запрещено гражданам, не достигшим 18 лет!";
//        Pattern pattern = Pattern.compile("н.+?и");
//
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            int start=matcher.start();
//            int end=matcher.end();
//            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
//        }
//        System.out.println(matcher.replaceFirst("продукции"));
//        System.out.println(matcher.replaceAll("лет"));
//        System.out.println(text);

//        для шестой работы абстрактная фабрика
//        GunshopAbsFactory factory;
//        factory = new AdalyanFactory();
//        factory.createHard();

//        для седьмой работы билдер
//        GunBuilder GunBuilder = new GunBuilder.Builder("Ammo").setColor("green").setTaste("Ammo1").setslaughter(4).build();
//        System.out.println(GunBuilder.getBrand());
//        System.out.println(GunBuilder.getColor());
//        System.out.println(GunBuilder.getTaste());
//        System.out.println(GunBuilder.getKrepost());

//        для восьмой работы компановщик
//        Market foil05mm = new Foil();
//        Market foil02mm = new Foil();
//        Market coil25x25mm = new Coal();
//        Market coil22x22mm = new Coal();
//        Market nozzlesgreen = new Nozzles();
//        Market nozzlesred = new Nozzles();
//        Market nozzlesblack = new Nozzles();
//        Set setextraplus = new Set();
//        Set setmini = new Set();
//        Set setmedium = new Set();
//
//        setmini.addComponent(foil02mm);
//        setmini.addComponent(coil22x22mm);
//        setmini.addComponent(nozzlesblack);
//
//        setmini.present();

//        для восьмой работы итератор
//        ArrayList<String> product = new ArrayList<String>();
//        product.add("9Calibre");
//        product.add("12Calibre");
//        product.add("37Calibre");
//        product.add("45Calibre");
//        product.add("57Calibre");
//        product.add("83Calibre");
//
//        ListIterator<String> listIter = product.listIterator();
//
//        while(((ListIterator) listIter).hasNext()){
//
//            System.out.println(listIter.next());
//        }
//        listIter.set("ammo");
//        while(listIter.hasPrevious()){
//
//            System.out.println(listIter.previous());
//        }
    }
}
