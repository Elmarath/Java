package NYP_Odev5_polymorphism;

import java.util.Date;

public class Soru1 {
    public static void main(String[] args) {

        obje_yazdir(new Object());// outputtaki toString metodunu Polymorphism kullanarak override edecegim ve
                                  // sonuc digerleri icin "java.lang.Object@762efe5d" gibi olmayancak.
        obje_yazdir(new kisi("Samet"));
        obje_yazdir(new ogrenci());
        obje_yazdir(new personel());
        obje_yazdir(new idari());
        obje_yazdir(new akademik());

    }

    kisi p = new ogrenci(); // upcasting
    ogrenci s = (ogrenci) new kisi(); // downcasting

    public static void obje_yazdir(Object x) {
        System.out.println(x.toString());
    }

}

class akademik extends personel {// one of the inheritance
    private String unvan;// bu sekildeki kullanilmayan degiskenler herhangi bir direktif verilmedigi icin
                         // bu sekilde yoksa yine ayni islemlere tabi tutulabilirler
    private double ofis_saati;

    public String getIsim() {// overriding
        return "Bora";
    }

    public String toString() {
        System.out.println("Sinif adi: 'akademik'");
        return getIsim();
    }

}

class idari extends personel {
    idari() {

    }

    private String calisilan_birim;

    public String getIsim() {// overriding
        return "Nisa";
    }

    public String toString() {
        System.out.println("Sinif adi: 'idari'");
        return getIsim();
    }
}

class personel extends kisi {
    personel() {

    }

    private Date myDate = new Date();
    private String ofis;
    private double maas;

    public String getIsim() {// overriding
        return "Bilge";
    }

    public String toString() {
        System.out.println("Sinif adi: 'personel'");
        return getIsim();
    }

}

class ogrenci extends kisi {
    ogrenci() {

    }

    private int sinif;

    public String getIsim() {// overriding
        return "ahmet";
    }

    public String toString() { // one of the overriding
        System.out.println("Sinif adi: 'ogrenci'");
        return getIsim();
    }
}

class kisi extends Object {
    kisi() {// Constructor

    }

    kisi(String newIsim) { // methot overloading
        isim = newIsim;
    }

    private String isim;
    private String adres;
    private String telefon_no;
    private String eposta;

    public void setTelefon_no(String newTelefon_no) {// bu ve
        telefon_no = newTelefon_no;
    }

    public String getTelefon_no() { // bu kisim butun classlardaki butun degiskenler icin yapilabilir. kodun
                                    // uzamamasi icin ornek olarak bu verildi.
        return telefon_no;
    }

    public void setIsim(String newIsim) {// bu ve
        isim = newIsim;
    }

    public String getIsim() { // bu kisim butun classlardaki butun degiskenler icin yapilabilir. kodun
                              // uzamamasi icin ornek olarak bu verildi.
        return isim;
    }

    public String toString() {
        System.out.println("Sinif adi: 'kisi' ");
        return isim;
    }

}
