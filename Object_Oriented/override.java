package Object_Oriented;

public class override {
    public static void main(String[] args) {
        // override üst sınıfın kodunun alt sınıfta aynı paramatreler ve fonksyon adı
        // ile tekrar düzenlenmesi
        A a = new A();
        a.p(10.0);
    }

}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // override
    public void p(double i) {
        System.out.println(i);
    }
}