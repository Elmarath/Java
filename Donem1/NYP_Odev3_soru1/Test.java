package NYP_Odev3_soru1;

public class Test {
    public static void main(String[] args) {

        gitar myGuitar = new gitar("Fender");
        myGuitar.setModel("ec-256");
        myGuitar.setYil(2020);

        gitar yourGuitar = new gitar();
        yourGuitar.setModel("Rw3Ts");
        yourGuitar.setYil(2018);

        System.out.println("myGuitar' in markasi: " + myGuitar.marka);
        System.out.println("yourGuitar' in markasi: " + yourGuitar.marka);
        System.out.println("myGuitar' in modeli:" + myGuitar.model);
        System.out.println("YourGuitar' in modeli: " + yourGuitar.model);
        System.out.println("myGuitar'in yili: " + myGuitar.yil);
        System.out.println("YourGuitar' in yili: " + yourGuitar.yil);

        anfi myAnfi = new anfi();
        myAnfi.setModel("Marshall");
        myAnfi.setModel("MG50GFX");

        anfi yourAnfi = new anfi(2008);
        yourAnfi.setModel("Marshall");
        yourAnfi.setModel("MG30GFX");

        System.out.println("myAnfi' in markasi: " + myAnfi.marka);
        System.out.println("yourAnfi' in markasi: " + yourAnfi.marka);
        System.out.println("myAnfi' in modeli:" + myAnfi.model);
        System.out.println("YourAnfi' in modeli: " + yourAnfi.model);
        System.out.println("myAnfi'in yili: " + myAnfi.yil);
        System.out.println("YourAnfi' in yili: " + yourAnfi.yil);

    }
}
