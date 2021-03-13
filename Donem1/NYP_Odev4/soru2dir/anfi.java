package NYP_Odev4.soru2dir;

public class anfi extends gitar_anfi {
    String marka = "Marshall";
    String model = "MG10G";
    int yil = 2015;

    anfi() {
        super();
    }

    anfi(String newMarka, String newModel, int newYil) {
        super();
        super.kg = 10;
        marka = newMarka;
        model = newModel;
        yil = newYil;
    }

    public void setMarka(String newMarka) {
        marka = newMarka;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYil(int newYil) {
        yil = newYil;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYil() {
        return yil;
    }
}