package NYP_Vize;

public abstract class hayvanlar {

    // daha sonra overload edilecek olsa da ortak ozelliklerden bir kaci.
    public void yemek() {
        System.out.println("Her hayvan yemek yer");
    }

    public void AirBreathing() {
        System.out.println("Her hayvan solunum yapar.");
    }
}
