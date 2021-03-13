package NYP_Vize;

public class atlar extends memeli implements otcul {
    private String cins;

    atlar() {
        cins = "Deniz ayisinin cinsi belirtilmedi";
    }

    atlar(String newCins) {
        cins = newCins;
    }

    @Override
    public void YemekYeme() {
        System.out.println("Atlar ot yerler.");
    }

    @Override
    public void UzunBagirsak() {
        System.out.println("Otcullar uzun bagirsaklara sahiptirler.");
    }

    public void setCins(String newCins) {
        cins = newCins;
    }

    public String getCins() {
        return cins;
    }
}
