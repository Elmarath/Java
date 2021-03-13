package NYP_Odev3_soru2;

import java.util.Date;

public class hesap {
    private Date toDaysDate = new Date();
    private int id = 0;
    private double bakiye = 0;
    private double faizOraniYillik = 0;

    hesap() {
    }

    hesap(int newId, double newBakiye) {
        id = newId;
        bakiye = newBakiye;
    }

    // soruda yillik faiz nerede tanimlanir belirtilmemekte. Bu sekilde
    // tanimlamasini yaptim.
    void setYillikFaiz(double newFaizOraniYillik) {
        faizOraniYillik = newFaizOraniYillik;
    }

    double getAylikFaizOrani() {
        double aylikFaizOrani = faizOraniYillik / 12;
        return aylikFaizOrani;
    }

    double getAylikFaiz(double aylikFaizOrani) {
        double aylikFaiz = bakiye * aylikFaizOrani;
        return aylikFaiz;
    }

    double paraCekme(double cekilenUcret) {
        bakiye -= cekilenUcret;
        return bakiye;
    }

    double paraYatir(double yatirilanUcret) {
        bakiye += yatirilanUcret;
        return bakiye;
    }

    void yazdir() {
        System.out.println("   ID numarasi: " + id + " Mevcut bakiye: " + bakiye + " hesap acilma tarihi: "
                + toDaysDate.toString());
    }

}
