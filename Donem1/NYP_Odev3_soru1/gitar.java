package NYP_Odev3_soru1;

public class gitar {
    String marka = "LTD";
    String model = "mh-1000-mnt";
    int yil = 2011;

    gitar() {

    }

    gitar(String newMarka) {
        marka = newMarka;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYil(int newYil) {
        yil = newYil;
    }
}
