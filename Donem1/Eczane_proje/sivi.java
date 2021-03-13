package Eczane_proje;

//sıvı formunda olan ilacların ortak özelliklerini içerir
public class sivi extends ilac {
    private double CozeltiYuzdesi;
    private double mililitre;
    private String tuketimSekli;

    // constructor
    sivi() {
        setCozeltiYuzdesi(-1);
    }

    // getter-setter
    public void setCozeltiYuzdesi(double newCozeltiYuzdesi) {
        CozeltiYuzdesi = newCozeltiYuzdesi;
    }

    public void setMililitre(double newMililitre) {

    }

    public void setTuketimSekli(String newTuketimSekli) {
        tuketimSekli = newTuketimSekli;
    }

    public double getCozeltiYuzdesi() {
        return CozeltiYuzdesi;
    }

    public double getMililitre() {
        return mililitre;
    }

    public String getTuketimSekli() {
        return tuketimSekli;
    }
}
