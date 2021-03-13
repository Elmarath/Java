package NYP_Vize;

public class kurtlar extends memeli implements etcil {

    // overloading
    kurtlar() {
        cins = "Cins belirtilmedi";
    }

    kurtlar(String newCins) {
        cins = newCins;
    }

    private String cins;

    public void kisaBagirsak() {
        System.out.println("Kurtlar etcil olduklarindan kisa bağirsaklara sahiptirler.");
    }

    @Override
    public void YemekYeme() {
        System.out.println("kurtlar et yerler.");
    }

    public void setCins(String newCins) {
        cins = newCins;
    }

    public String getCins() {
        return cins;
    }
}
