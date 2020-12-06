package NYP_Odev4.soru2dir;

public class gitar extends gitar_anfi {
    String marka = "LTD";
    String model = "mh-1000-mnt";
    int yil = 2011;

    gitar() {
        super();
    }

    gitar(String newMarka, String newModel, int newYil) {
        super();
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
