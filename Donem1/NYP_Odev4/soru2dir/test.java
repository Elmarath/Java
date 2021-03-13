package NYP_Odev4.soru2dir;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        gitar gitar1 = new gitar();
        gitar gitar2 = new gitar("LTD", "MH-2000-mnt", 2000);
        anfi anfi1 = new anfi();
        anfi anfi2 = new anfi("Mikado", "mt42bt", 2018);

        ArrayList<gitar> gitarlar = new ArrayList<>();
        ArrayList<anfi> anfiler = new ArrayList<>();

        gitar1.setMarka("fender");
        gitar1.setMarka("Stratocester");
        gitar1.setYil(2017);
        gitarlar.add(gitar1);
        gitarlar.add(gitar2);

        anfi1.setMarka("Blackstar");
        anfi1.setModel("Core10");
        anfi1.setYil(2012);
        anfiler.add(anfi1);
        anfiler.add(anfi2);

        System.out.println("Get metodu ile alınan bazı  bilgiler:");
        System.out.println("gitar1 marka: " + gitar1.getMarka());
        System.out.println("gitar1 model: " + gitar1.getModel());
        System.out.println("gitar1 yil: " + gitar1.getModel());

        System.out.println("anfi1 marka: " + anfi1.getMarka());
        System.out.println("anfi1 model: " + anfi1.getModel());
        System.out.println("anfi1 yil: " + anfi1.getYil());

        System.out.println("'Ana Class' tan alinan ortak olabilecek özelliklerden:'");
        System.out.println("gitar1 kilogram: " + gitar1.kg);
        System.out.println("anfi1 kilogram: " + anfi1.kg);

        System.out.println("ArrayList' e alınmış objelerin birer özellikleri");
        System.out.println("Arraylist[1] -> gitar1 marka: " + gitarlar.get(1).getMarka());
        System.out.println("Arraylist[1] -> anfi1 marka: " + anfiler.get(1).getMarka());
    }
}
