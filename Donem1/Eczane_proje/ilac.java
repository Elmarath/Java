package Eczane_proje;

//bir ilacta olmasi gereken temel ozellikleri icerir.
public class ilac {
    private String uretici_firma;
    private String ilac_adi;
    private String kullanim_amaci;
    private String etken_madde;
    private double fiyat;

    // constructors
    ilac() {
        setUretici_firma("Bulunamadi");
        setIlac_adi("Bulunamadi");
        setKullanim_amaci("Bulunamadi");
        setEtken_madde("Bulunamadi");
        setFiyat(-1);
    }

    // istersek fiyatini belirtip ilaci girebiliriz.
    ilac(double newFiyat) {
        setUretici_firma("Bulunamadi");
        setIlac_adi("Bulunamadi");
        setKullanim_amaci("Bulunamadi");
        setEtken_madde("Bulunamadi");
        fiyat = newFiyat;
    }

    // Gettter-Setter
    public void setUretici_firma(String newUretici_firma) {
        uretici_firma = newUretici_firma;
    }

    public void setIlac_adi(String newIlac_adi) {
        ilac_adi = newIlac_adi;
    }

    public void setKullanim_amaci(String newKullanim_amaci) {
        kullanim_amaci = newKullanim_amaci;
    }

    public void setEtken_madde(String newEtken_madde) {
        etken_madde = newEtken_madde;
    }

    public void setFiyat(double newFiyat) {
        fiyat = newFiyat;
    }

    public String getUretici_firma() {
        return uretici_firma;
    }

    public String getIlac_adi() {
        return ilac_adi;
    }

    public String getKullanim_amaci() {
        return kullanim_amaci;
    }

    public String getEtken_madde() {
        return etken_madde;
    }

    public double getFiyat() {
        return fiyat;
    }

}
