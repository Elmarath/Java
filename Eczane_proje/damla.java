package Eczane_proje;

//damla şeklinde satilan ilacların ortak özelliklerini içerir.
public class damla extends sivi {
    private String tuketimSekli;

    damla() {
        tuketimSekli = "Bulunamadi";
    }

    public void setTuketimSekli(String newTuketimSekli) {
        tuketimSekli = newTuketimSekli;
    }

    public String getTuketimSekli() {
        return tuketimSekli;
    }
}
