package Eczane_proje;

//tablet şeklinde satılan ilaçlarin alt özelliklerini içerir
public class tablet extends ilac {

    private double miligram;
    private int tabletAdet;
    private String kapCinsi;
    private String tuketimSekli;

    // tuketim sekli getter setter metotlari ile polymorphism uygulanmıştır.

    tablet() {
        miligram = -1;
        tabletAdet = -1;
        kapCinsi = "Bulunamadi";
        tuketimSekli = "Bulunamadi";
    }

    // getter-setter
    public void setMiligram(double newMiligram) {
        miligram = newMiligram;
    }

    public void setTabletAdet(int newTabletAdet) {
        tabletAdet = newTabletAdet;
    }

    public void setKapCinsi(String newKapCinsi) {
        kapCinsi = newKapCinsi;
    }

    public void setTuketimSekli(String newTuketimSekli) {
        tuketimSekli = newTuketimSekli;
    }

    public double getMiligram() {
        return miligram;
    }

    public int getTabletAdet() {
        return tabletAdet;
    }

    public String getKapCinsi() {
        return kapCinsi;
    }

    public String getTuketimSekli() {
        return tuketimSekli;
    }
}
