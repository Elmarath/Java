package NYP_Vize;

public class zebralar extends memeli implements otcul {
    private String cins;

    zebralar() {
        cins = "Zebranin cinsi belirtilmedi";
    }

    zebralar(String newCins) {
        cins = newCins;
    }

    @Override
    public void YemekYeme() {
        System.out.println("Zebralar ot yerler.");
    }

    @Override
    public void UzunBagirsak() {
        System.out.println("Zebralar uzun bagirsak yapisina sahiptirler.");
    }

    public void setCins(String newCins) {
        cins = newCins;
    }

    public String getCins() {
        return cins;
    }
}
