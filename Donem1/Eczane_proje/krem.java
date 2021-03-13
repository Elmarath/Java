package Eczane_proje;

//krem şeklinde satilan ilacların ortak özelliklerini içerir
public class krem extends sivi {

    private String tuketimSekli;
    // tuketim sekli getter setter metotlari ile polymorphism uygulanmıştır.

    krem() {
        tuketimSekli = "Bulunamadi";
    }

    krem(double newFiyat) {

    }

    public void setTuketimSekli(String newTuketimSekli) {
        tuketimSekli = newTuketimSekli;
    }

    public String getTuketimSekli() {
        return tuketimSekli;
    }

}
