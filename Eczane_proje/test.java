package Eczane_proje;

import java.util.ArrayList;
import java.util.Scanner;

class objects {
    tablet tablet1 = new tablet();
    krem krem1 = new krem();
    sprey sprey1 = new sprey();
    damla damla1 = new damla();

}

public class test {
    public static ArrayList<objects> Ilac_olustur() {

        ArrayList<objects> ilaclar = new ArrayList<objects>();

        // her en alt classtan birer ornek:

        objects object1 = new objects();

        object1.tablet1.setIlac_adi("Ciprales");
        object1.tablet1.setUretici_firma("Lundbeck");
        object1.tablet1.setEtken_madde("Oksalat");
        object1.tablet1.setKullanim_amaci("Sakinleştirici/ağrı kesici");
        object1.tablet1.setFiyat(31.85);
        object1.tablet1.setKapCinsi("Film kap");
        object1.tablet1.setTuketimSekli("Su ile yutma");
        object1.tablet1.setMiligram(10);
        object1.tablet1.setTabletAdet(28);

        ilaclar.add(object1);

        objects object2 = new objects();
        object2.krem1.setIlac_adi("Fucicort");
        object2.krem1.setUretici_firma("Abdi İbdahim");
        object2.krem1.setEtken_madde("Fusidik asit - Betamezaton valerat");
        object2.krem1.setKullanim_amaci("Sivilce kremi");
        object2.krem1.setFiyat(40.40);
        object2.krem1.setTuketimSekli("Temiz cilde günde 2-3 kez sürülür");
        object2.krem1.setCozeltiYuzdesi(2);
        object2.krem1.setMililitre(30);

        ilaclar.add(object2);

        objects object3 = new objects();

        object3.sprey1.setIlac_adi("Foradil Combi");
        object3.sprey1.setUretici_firma("Novartis");
        object3.sprey1.setEtken_madde("Formoterol");
        object3.sprey1.setKullanim_amaci("Astim semptomu kontrolü");
        object3.sprey1.setFiyat(70.48);
        object3.sprey1.setTuketimSekli("Nefes yolu ile");
        object3.sprey1.setCozeltiYuzdesi(6);
        object3.sprey1.setMililitre(2);

        ilaclar.add(object3);

        objects object4 = new objects();

        object4.damla1.setIlac_adi("Tomec");
        object4.damla1.setUretici_firma("Abdi Ibrahim");
        object4.damla1.setEtken_madde("dorzolamid hidroklorür");
        object4.damla1.setKullanim_amaci("Göz tansiyonunu düşürmek");
        object4.damla1.setFiyat(22.03);
        object4.damla1.setTuketimSekli("Göze 1 damla");
        object4.damla1.setCozeltiYuzdesi(0.5);
        object4.damla1.setMililitre(5);

        return ilaclar;
    }

    public static ArrayList<objects> Ilac_ekle(ArrayList<objects> ilaclar) {
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ilac'ın türü nedir?(tablet, krem, sprey, damla)");
        String IlacTuru = sc2.nextLine();

        // dogru giris kontrolu
        if (!(IlacTuru.equals("tablet") || IlacTuru.equals("krem") || IlacTuru.equals("sprey")
                || IlacTuru.equals("damla"))) {
            System.out.println("Geçersiz giriş yaptınız.");
            sc2.close();
            sc3.close();
            return ilaclar;
        }

        objects YeniIlac = new objects();
        System.out.println("Verilen özellikleri doldurunuz.");

        System.out.println("Ilaç ismi: ");
        String IlacIsmi = sc2.nextLine();
        System.out.println("Uretici firma: ");
        String UreticiFirma = sc2.nextLine();
        System.out.println("Etken madde: ");
        String EtkenMadde = sc2.nextLine();
        System.out.println("Kullanim amaci: ");
        String KullanimAmaci = sc2.nextLine();
        System.out.println("Tuketim sekli:");
        String TuketimSekli = sc2.nextLine();
        System.out.println("Fiyati: ");
        int Fiyat = sc3.nextInt();

        if (IlacTuru.equals("tablet")) {
            System.out.println("Miligram:");
            int Miligram = sc3.nextInt();
            System.out.println("Tablet adeti");
            int TabletAdet = sc3.nextInt();
            System.out.println("KapCinsi");
            String KapCinsi = sc2.nextLine();

            YeniIlac.tablet1.setMiligram(Miligram);
            YeniIlac.tablet1.setTabletAdet(TabletAdet);
            YeniIlac.tablet1.setKapCinsi(KapCinsi);

            YeniIlac.tablet1.setIlac_adi(IlacIsmi);
            YeniIlac.tablet1.setUretici_firma(UreticiFirma);
            YeniIlac.tablet1.setEtken_madde(EtkenMadde);
            YeniIlac.tablet1.setKullanim_amaci(KullanimAmaci);
            YeniIlac.tablet1.setTuketimSekli(TuketimSekli);
            YeniIlac.tablet1.setFiyat(Fiyat);
        } else if (IlacTuru.equals("krem")) {
            YeniIlac.krem1.setIlac_adi(IlacIsmi);
            YeniIlac.krem1.setUretici_firma(UreticiFirma);
            YeniIlac.krem1.setEtken_madde(EtkenMadde);
            YeniIlac.krem1.setKullanim_amaci(KullanimAmaci);
            YeniIlac.krem1.setTuketimSekli(TuketimSekli);
            YeniIlac.krem1.setFiyat(Fiyat);
        } else if (IlacTuru.equals("spey")) {
            YeniIlac.sprey1.setIlac_adi(IlacIsmi);
            YeniIlac.sprey1.setUretici_firma(UreticiFirma);
            YeniIlac.sprey1.setEtken_madde(EtkenMadde);
            YeniIlac.sprey1.setKullanim_amaci(KullanimAmaci);
            YeniIlac.sprey1.setTuketimSekli(TuketimSekli);
            YeniIlac.sprey1.setFiyat(Fiyat);
        } else if (IlacTuru.equals("damla")) {
            YeniIlac.damla1.setIlac_adi(IlacIsmi);
            YeniIlac.damla1.setUretici_firma(UreticiFirma);
            YeniIlac.damla1.setEtken_madde(EtkenMadde);
            YeniIlac.damla1.setKullanim_amaci(KullanimAmaci);
            YeniIlac.damla1.setTuketimSekli(TuketimSekli);
            YeniIlac.damla1.setFiyat(Fiyat);
        }

        System.out.println(YeniIlac.damla1.getIlac_adi());

        ilaclar.add(YeniIlac);

        sc2.close();
        sc3.close();
        return ilaclar;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<objects> ilaclar = new ArrayList<objects>();

        // istersek yeni ilac ekleyebiliriz.
        System.out.println("Ilac eklemek istiyor musunuz?(1/0)");
        // yapılabildigini gostermek icin en basit hali tercih edilmistir.
        ilaclar = Ilac_olustur();
        if (sc1.nextInt() == 1) {
            ilaclar = Ilac_ekle(ilaclar);
        }
        System.out.println("Ilac silmek istiyor musunuz?(1/0)");
        // burada silinebildiğini gösterdim. Yoksa ideal bir silme şekli değil.
        // uygulamanin nasıl çalışacağına göre silme tarzı değişebilir.
        if (sc1.nextInt() == 1) {
            System.out.println("silmek istediğiniz ilacın indexini giriniz.");
            ilaclar.remove(sc1.nextInt());
        }

        // istersek var olan ilaclari ve özelliklerini yazdirabiliriz.
        // yazdirmanın algoritmasi, uygulamanın amacına gore degisebileceginden ilkel
        // bir halde biraktim.
        System.out.println("Ornek olarak ilac 1:");
        System.out.println(ilaclar.get(0).tablet1.getIlac_adi());
        System.out.println(ilaclar.get(0).tablet1.getUretici_firma());
        System.out.println(ilaclar.get(0).tablet1.getEtken_madde());
        System.out.println(ilaclar.get(0).tablet1.getKullanim_amaci());
        System.out.println(ilaclar.get(0).tablet1.getTuketimSekli());
        System.out.println(ilaclar.get(0).tablet1.getFiyat());
        System.out.println(ilaclar.get(0).tablet1.getMiligram());
        System.out.println(ilaclar.get(0).tablet1.getTabletAdet());

        System.out.println("Ornek olarak ilac 2:");
        System.out.println(ilaclar.get(1).krem1.getIlac_adi());
        System.out.println(ilaclar.get(1).krem1.getUretici_firma());
        System.out.println(ilaclar.get(1).krem1.getEtken_madde());
        System.out.println(ilaclar.get(1).krem1.getKullanim_amaci());
        System.out.println(ilaclar.get(1).krem1.getTuketimSekli());
        System.out.println(ilaclar.get(1).krem1.getFiyat());

        System.out.println("ilac 1 ve ilac 2 fiyatlari toplami:");
        System.out.println(ilaclar.get(0).tablet1.getFiyat() + ilaclar.get(1).krem1.getFiyat());

        sc1.close();
    }
}
