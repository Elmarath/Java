package Eczane_proje;

//sprey şeklinde satilan ilaçların ortak özelliklerini içerir
public class sprey extends sivi {

    private String tuketimSekli;

    sprey() {
        tuketimSekli = "Bulunamadi";
    }

    public void setTuketimSekli(String newTuketimSekli) {
        tuketimSekli = newTuketimSekli;
    }

    public String getTuketimSekli() {
        return tuketimSekli;
    }
}
