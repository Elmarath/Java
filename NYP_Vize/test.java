package NYP_Vize;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        // sonra kullancilacak arraylist olusturulmasi.
        ArrayList<memeli> list = new ArrayList<memeli>();

        // ornek hayvanlar olusturuluyor.
        kurtlar kurt1 = new kurtlar();
        atlar at1 = new atlar();
        zebralar zebra1 = new zebralar();

        // ornek hayvanlar yazdiriliyor.
        kurt1.setCins("Iber kurdu");
        System.out.println(kurt1.getCins());
        kurt1.AirBreathing();
        kurt1.YemekYeme();
        kurt1.kisaBagirsak();

        System.out.println("\n");

        at1.setCins("Arap Ati");
        System.out.println(at1.getCins());
        at1.AirBreathing();
        at1.YemekYeme();
        at1.UzunBagirsak();

        System.out.println("\n");

        zebra1.setCins("Grevy zebrasi");
        System.out.println(zebra1.getCins());
        zebra1.AirBreathing();
        zebra1.YemekYeme();
        zebra1.UzunBagirsak();

        System.out.println("\n");

        // polymorphism kullaniyorum.
        memeli kurt2 = new kurtlar("Sibirya kurdu");
        memeli at2 = new atlar("Bozkir ati");
        memeli zebra2 = new zebralar("Dağ zebrasi");
        // hepsi ayni tur olduklarından ArrayList' e eklenebilir.
        list.add(kurt2);
        list.add(at2);
        list.add(zebra2);

        System.out.println("Tum hayvanlari memeli ortak sinifina upcast edip AirBreating ortak fonksyonunu alinca:");
        list.get(0).AirBreathing();
        list.get(1).AirBreathing();
        list.get(2).AirBreathing();
    }

}
