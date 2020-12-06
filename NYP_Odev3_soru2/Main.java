package NYP_Odev3_soru2;

public class Main {
    public static void main(String[] args) {
        hesap Hesap = new hesap(112233, 20000);
        Hesap.setYillikFaiz(0.045);
        // para yatirilmadan once
        System.out.println("Hesaba para yatirilmadan once: ");

        Hesap.yazdir();

        System.out.println("Hesaba para yatirildiktan sonra: ");
        Hesap.paraYatir(5000);
        Hesap.yazdir();

        System.out.println("Hesaptan para çekildikten sonra: ");
        Hesap.paraCekme(7000);
        Hesap.yazdir();
    }
}
